package com.healthmanagement.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.internal.tls.OkHostnameVerifier;

public class HttpUtil {
   public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
       OkHttpClient client = new OkHttpClient();
       Request request = new Request.Builder().url(address).build();
       client.newCall(request).enqueue(callback);
   }
}
