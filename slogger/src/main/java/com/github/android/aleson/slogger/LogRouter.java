package com.github.android.aleson.slogger;

import android.util.Log;

public class LogRouter {


    private static String DEFAULT_TAG = "TAG";
    private static String UNEXPECTED_ACTION = "SLogger";
    private static boolean IS_DEVELOPMENT_BUILD;

    private static String TAG;
    private static String URL;
    private static String MEHTOD;


    public static void log(String tag, Object data, int action) {
        if (IS_DEVELOPMENT_BUILD) {
            handleTag(tag);
            LogFactory.action(action);
            print(action, data);
        }
    }

    public static void log(String tag, String url, String method, Object data, int action) {
        if (IS_DEVELOPMENT_BUILD) {
            URL = url;
            MEHTOD = method;
            handleTag(tag);
            LogFactory.action(action);
            print(action, data);
        }
    }

    private static void print(int action, Object data) {
        switch (action) {
            case LogAction.INFO:
                Log.i(TAG, LogFactory.geData(data));
                break;
            case LogAction.WARN:
                Log.w(TAG, LogFactory.geData(data));
                break;
            case LogAction.ERROR:
                Log.e(TAG, LogFactory.geData(data));
                break;
            case LogAction.DEBUG:
                Log.d(TAG, LogFactory.geData(data));
                break;
            case LogAction.RESPONSE:
                logLargeStringResponse(LogFactory.getResponseData(URL, MEHTOD, data));
                break;
            default:
                Log.i(UNEXPECTED_ACTION, "Sei lá");
                break;
        }
    }

    private static void logLargeStringResponse(String str) {
        if (str.length() > 3000) {
            Log.d(TAG, str.substring(0, 3000));
            logLargeStringResponse(str.substring(3000));
        } else {
            Log.d(TAG, str);
        }
    }

    private static void handleTag(String tag) {
        if (tag == null) {
            TAG = DEFAULT_TAG;
        } else {
            TAG = tag;
        }
    }

    public static void setDefaultTag(String defaultTag) {
        DEFAULT_TAG = defaultTag;
    }

    public static void setEnviroment(boolean isDevelopmentBuild) {
        IS_DEVELOPMENT_BUILD = isDevelopmentBuild;
    }
}
