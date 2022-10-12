package com.trader.core.utils;

import java.util.Base64;

public class Base64Utils {
    public static String StringToBase64(String text) {
        byte[] bytes = text.getBytes();
        return Base64.getEncoder().encodeToString(bytes);
    }

    public static String Base64ToString(String base64) {
        return new String(Base64.getDecoder().decode(base64));
    }
}
