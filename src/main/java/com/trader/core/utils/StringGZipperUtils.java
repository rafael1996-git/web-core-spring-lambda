package com.trader.core.utils;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class StringGZipperUtils {
    public static String ungzip(byte[] bytes) throws IOException {
        InputStreamReader isr = new InputStreamReader(new GZIPInputStream(new ByteArrayInputStream(bytes)), StandardCharsets.UTF_8);
        StringWriter sw = new StringWriter();
        char[] chars = new char[1024];
        for (int len; (len = isr.read(chars)) > 0; ) {
            sw.write(chars, 0, len);
        }
        return sw.toString();
    }

    public static byte[] gzip(String s) throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        GZIPOutputStream gzip = new GZIPOutputStream(bos);
        OutputStreamWriter osw = new OutputStreamWriter(gzip, StandardCharsets.UTF_8);
        osw.write(s);
        osw.close();

        return bos.toByteArray();
    }
}

