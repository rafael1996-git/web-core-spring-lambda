package com.trader.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import com.trader.core.utils.JsonConstantsUtils;

import java.util.Date;
import java.util.Objects;

public class GenericModel extends BaseModel {
    private final static long serialVersionUID = 7468861301173478393L;

    @JsonProperty(JsonConstantsUtils.PROPERTY_NAME_USER_WHO_MODIFIED)
    @SerializedName(JsonConstantsUtils.PROPERTY_NAME_USER_WHO_MODIFIED)
    String userWhoModified;

    @JsonProperty(JsonConstantsUtils.PROPERTY_NAME_LAST_MODIFICATION)
    @SerializedName(JsonConstantsUtils.PROPERTY_NAME_LAST_MODIFICATION)
    Date lastModification;

    public String getUserWhoModified() {
        return userWhoModified;
    }

    public void setUserWhoModified(String userWhoModified) {
        this.userWhoModified = userWhoModified;
    }

    public Date getLastModification() {
        return lastModification;
    }

    public void setLastModification(Date lastModification) {
        this.lastModification = lastModification;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GenericModel that = (GenericModel) o;
        return Objects.equals(userWhoModified, that.userWhoModified) && Objects.equals(lastModification, that.lastModification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userWhoModified, lastModification);
    }
}
