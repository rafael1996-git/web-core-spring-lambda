package com.trader.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import com.trader.core.utils.JsonConstantsUtils;

import java.util.Objects;

public class MessageModel extends BaseModel {
    private final static long serialVersionUID = 7468861301173478393L;

    @JsonProperty(JsonConstantsUtils.PROPERTY_NAME_MESSAGE_ID)
    @SerializedName(JsonConstantsUtils.PROPERTY_NAME_MESSAGE_ID)
    private Long id;

    @JsonProperty(JsonConstantsUtils.PROPERTY_NAME_MESSAGE_SHORT_DESCRIPTION)
    @SerializedName(JsonConstantsUtils.PROPERTY_NAME_MESSAGE_SHORT_DESCRIPTION)
    private String shortDescription;

    @JsonProperty(JsonConstantsUtils.PROPERTY_NAME_MESSAGE_LONG_DESCRIPTION)
    @SerializedName(JsonConstantsUtils.PROPERTY_NAME_MESSAGE_LONG_DESCRIPTION)
    private String longDescription;

    @JsonProperty(JsonConstantsUtils.PROPERTY_NAME_MESSAGE_CODE)
    @SerializedName(JsonConstantsUtils.PROPERTY_NAME_MESSAGE_CODE)
    private String code;

    public MessageModel(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public MessageModel(Long id,
                        String shortDescription,
                        String longDescription,
                        String code) {
        this.id = id;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
        this.code = code;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MessageModel that = (MessageModel) o;
        return Objects.equals(id, that.id) && Objects.equals(shortDescription, that.shortDescription) && Objects.equals(longDescription, that.longDescription) && Objects.equals(code, that.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, shortDescription, longDescription, code);
    }
}
