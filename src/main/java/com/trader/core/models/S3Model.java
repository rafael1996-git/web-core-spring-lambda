package com.trader.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class S3Model extends BaseModel {
    @JsonProperty("bucket_name")
    @SerializedName("bucket_name")
    String bucketName;
    @JsonProperty("bucket_key")
    @SerializedName("bucket_key")
    String bucketKey;
    @JsonProperty("url")
    @SerializedName("url")
    String url;

    public S3Model(String bucketName,
                   String bucketKey,
                   String url) {
        this.bucketName = bucketName;
        this.bucketKey = bucketKey;
        this.url = url;
    }

    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketKey() {
        return bucketKey;
    }

    public void setBucketKey(String bucketKey) {
        this.bucketKey = bucketKey;
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
        S3Model s3Model = (S3Model) o;
        return Objects.equals(bucketName, s3Model.bucketName) && Objects.equals(bucketKey, s3Model.bucketKey) && Objects.equals(url, s3Model.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bucketName, bucketKey, url);
    }
}
