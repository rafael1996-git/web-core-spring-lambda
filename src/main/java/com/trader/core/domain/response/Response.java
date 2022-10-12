package com.trader.core.domain.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import com.trader.core.models.BaseModel;
import java.util.Objects;

public class Response extends BaseModel {
    @JsonProperty("data")
    @SerializedName("data")
    private Object data;

    public Response(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Response response = (Response) o;
        return Objects.equals(data, response.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }
}
