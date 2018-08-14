package com.webshop.plugin;

public interface RestPlugin {
    String get(String url);
    String post(String url, String body);
}
