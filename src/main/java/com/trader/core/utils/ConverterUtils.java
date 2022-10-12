package com.trader.core.utils;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

public class ConverterUtils {
    public static JsonObject toJsonObject(Object o) {
        JsonObject jsonObject;
        JsonElement jsonElement = null;

        try {
            jsonElement = new JsonParser().parse(GsonParserUtils.getGson().toJson(o));
        } catch (JsonSyntaxException ex) {
            ex.printStackTrace();
        } finally {
            jsonObject = jsonElement != null ? jsonElement.getAsJsonObject() : null;
        }

        return jsonObject;
    }
}