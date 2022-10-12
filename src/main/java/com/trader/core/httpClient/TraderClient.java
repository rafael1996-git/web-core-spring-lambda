package com.trader.core.httpClient;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.net.URI;

public class TraderClient {
    public static String sendGet(String url) throws Exception {
        String response = null;
        try( CloseableHttpClient httpClient = HttpClientBuilder.create().useSystemProperties().build()) {
            URI uri = new URIBuilder(url).build();
            HttpGet httpGet = new HttpGet(uri);
            try(CloseableHttpResponse httpResponse = httpClient.execute(httpGet)) {
              response = EntityUtils.toString(  httpResponse.getEntity());
            }
        }
        return response;
    }

    public static String sendPost(String url, String data) throws Exception{
        String response = null;
        try (CloseableHttpClient httpClient = HttpClientBuilder.create().useSystemProperties().build()){
            URI uri = new URIBuilder(url).build();
            HttpPost httpPost = new HttpPost(uri);
            StringEntity params = new StringEntity(data);
            httpPost.setHeader("Accept","application/json");
            httpPost.setHeader("Content-type","application/json");
            httpPost.setEntity(params);
            try (CloseableHttpResponse httpResponse = httpClient.execute(httpPost)){
                response = EntityUtils.toString(httpResponse.getEntity());
            }
        }
        return response;
    }

    public static String sendPut(String url, String data) throws Exception{
        String response = null;
        try (CloseableHttpClient httpClient = HttpClientBuilder.create().useSystemProperties().build()){
            URI uri = new URIBuilder(url).build();
            HttpPut httpPut = new HttpPut(uri);
            StringEntity params = new StringEntity(data);
            httpPut.setEntity(params);
            httpPut.setHeader("Accept","application/json");
            httpPut.setHeader("Content-type","application/json");
            try (CloseableHttpResponse httpResponse = httpClient.execute(httpPut)){
                response = EntityUtils.toString(httpResponse.getEntity());
            }
        }
        return response;
    }
}
