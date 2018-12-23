package com.github.android.aleson.slogger;

public class SLogger {

    public static void init(boolean isDevelopmentBuild) {
        LogRouter.setEnviroment(isDevelopmentBuild);
    }

    public static void defaulTag(String defaultTag) {
        LogRouter.setDefaultTag(defaultTag);
    }

    //DEBUG

    public static void d(Object data) {
        d(null, data);
    }

    public static void d(String tag, Object data) {
        LogRouter.log(tag, data, LogAction.DEBUG);
    }

    //ERROR

    public static void e(Object data) {
        e(null, data);
    }

    public static void e(String tag, Object data) {
        LogRouter.log(tag, data, LogAction.ERROR);
    }

    //WARN

    public static void w(Object data) {
        w(null, data);
    }

    public static void w(String tag, Object data) {
        LogRouter.log(tag, data, LogAction.WARN);
    }

    //INFO

    public static void i(Object data) {
        i(null, data);
    }

    public static void i(String tag, Object data) {
        LogRouter.log(tag, data, LogAction.INFO);
    }

    //RESPONSE

    public static void r(String url, String mehtod, Object data) {
        r(null, url, mehtod, data);
    }

    public static void r(String tag, String url, String mehtod, Object data) {
        LogRouter.log(tag, url, mehtod, data, LogAction.RESPONSE);
    }
}
