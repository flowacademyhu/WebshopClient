package com.webshop.logic.plugin;

import com.webshop.plugin.RestPlugin;
import okhttp3.*;

import java.io.IOException;

public class OkHttpRestPlugin implements RestPlugin {

    private OkHttpClient client;

    public OkHttpRestPlugin() {
        client = new OkHttpClient();
    }

    @Override
    public String get(String url) {
        Request request = new Request.Builder()
                .url(url)
                .build();

        try {
            Response response = client.newCall(request).execute();
            ResponseBody body = response.body();
            if (body != null) {
                return body.string();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static final MediaType JSON
            = MediaType.parse("application/json; charset=utf-8");

    @Override
    public String post(String url, String json) {
        RequestBody body = RequestBody.create(JSON, json);
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        Response response = null;
        try {
            response = client.newCall(request).execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            if (response != null) {
                ResponseBody b = response.body();
                if (b != null) {
                    return b.string();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
