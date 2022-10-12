package com.trader.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class BucketModel extends BaseModel {
    @JsonProperty("bucketName")
    @SerializedName("bucketName")
    String bucketName;
    @JsonProperty("configurationFile")
    @SerializedName("configurationFile")
    String configurationFile;
    @JsonProperty("requestBucketUpload")
    @SerializedName("requestBucketUpload")
    String requestBucketUpload;

    public BucketModel(String bucketName,
                       String configurationFile,
                       String requestBucketUpload) {
        this.bucketName = bucketName;
        this.configurationFile = configurationFile;
        this.requestBucketUpload = requestBucketUpload;
    }

    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getConfigurationFile() {
        return configurationFile;
    }

    public void setConfigurationFile(String configurationFile) {
        this.configurationFile = configurationFile;
    }

    public String getRequestBucketUpload() {
        return requestBucketUpload;
    }

    public void setRequestBucketUpload(String requestBucketUpload) {
        this.requestBucketUpload = requestBucketUpload;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BucketModel that = (BucketModel) o;
        return Objects.equals(bucketName, that.bucketName) && Objects.equals(configurationFile, that.configurationFile) && Objects.equals(requestBucketUpload, that.requestBucketUpload);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bucketName, configurationFile, requestBucketUpload);
    }
}
