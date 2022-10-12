package com.trader.core.models;

import com.google.gson.JsonObject;
import com.trader.core.utils.ConverterUtils;

import java.io.Serializable;

public class BaseModel implements Serializable {
    private final static long serialVersionUID = 7468861301173478393L;

    public JsonObject toJsonObject() {
        return ConverterUtils.toJsonObject(this);
    }
}
