package com.example.yxl.coolweather.util;

/**
 * Created by yxl on 16/9/20.
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
