package com.github.android.aleson.slogger;

import android.util.Log;

public class LogRouter {


    private static String DEFAULT_TAG = "TAG";
    private static String UNEXPECTED_ACTION = "SLogger";
    private static boolean IS_DEVELOPMENT_BUILD;

    private static String TAG;

    public static void log(String tag, Object data, int action) {
        if (IS_DEVELOPMENT_BUILD) {
            TAG = tag;
            LogFactory.action(action);
            print(action, data);
        }
    }

    private static void print(int action, Object data) {
        switch (action) {
            case LogAction.INFO:
                Log.i(handleTag(), LogFactory.geData(data));
                break;
            case LogAction.WARN:
                Log.w(handleTag(), LogFactory.geData(data));
                break;
            case LogAction.ERROR:
                Log.e(handleTag(), LogFactory.geData(data));
                break;
            case LogAction.DEBUG:
                Log.d(handleTag(), LogFactory.geData(data));
                break;
            case LogAction.RESPONSE:
                Log.d(handleTag(), LogFactory.geData(data));
                break;
            default:
                Log.i(UNEXPECTED_ACTION, "Sei lá");
                break;
        }
    }

    private static String handleTag() {
        if (TAG == null) {
            return DEFAULT_TAG;
        } else {
            return TAG;
        }
    }

    public static void setDefaultTag(String defaultTag) {
        DEFAULT_TAG = defaultTag;
    }

    public static void setEnviroment(boolean isDevelopmentBuild) {
        IS_DEVELOPMENT_BUILD = isDevelopmentBuild;
    }
}
