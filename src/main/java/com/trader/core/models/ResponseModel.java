package com.trader.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.trader.core.utils.JsonConstantsUtils;

import java.util.List;
import java.util.Objects;

public class ResponseModel extends BaseModel {
    private final static long serialVersionUID = 7468861301173478393L;

    @JsonProperty(JsonConstantsUtils.PROPERTY_NAME_CODE)
    @SerializedName(JsonConstantsUtils.PROPERTY_NAME_CODE)
    private Integer code;

    @JsonProperty(JsonConstantsUtils.PROPERTY_NAME_SUCCESS)
    @SerializedName(JsonConstantsUtils.PROPERTY_NAME_SUCCESS)
    private Boolean success = Boolean.FALSE;

    @JsonProperty(JsonConstantsUtils.PROPERTY_NAME_S3)
    @SerializedName(JsonConstantsUtils.PROPERTY_NAME_S3)
    private S3Model s3 = new S3Model("", "", "");

    @JsonProperty(JsonConstantsUtils.PROPERTY_NAME_ITEMS)
    @SerializedName(JsonConstantsUtils.PROPERTY_NAME_ITEMS)
    private List<JsonObject> items;

    @JsonProperty(JsonConstantsUtils.PROPERTY_NAME_MESSAGE)
    @SerializedName(JsonConstantsUtils.PROPERTY_NAME_MESSAGE)
    private MessageModel message;

    @JsonProperty(JsonConstantsUtils.PROPERTY_NAME_URL)
    @SerializedName(JsonConstantsUtils.PROPERTY_NAME_URL)
    private String url = "";

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public S3Model getS3() {
        return s3;
    }

    public void setS3(S3Model s3) {
        this.s3 = s3;
    }

    public List<JsonObject> getItems() {
        return items;
    }

    public void setItems(List<JsonObject> items) {
        this.items = items;
    }

    public MessageModel getMessage() {
        return message;
    }

    public void setMessage(MessageModel message) {
        this.message = message;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResponseModel that = (ResponseModel) o;
        return Objects.equals(code, that.code) && Objects.equals(success, that.success) && Objects.equals(s3, that.s3) && Objects.equals(items, that.items) && Objects.equals(message, that.message) && Objects.equals(url, that.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, success, s3, items, message, url);
    }
}
