package com.webshop.logic.plugin;

import com.webshop.plugin.RestPlugin;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

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
            if (body != null){
                return body.string();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String post(String url, String body) {
        return null;
    }
}
