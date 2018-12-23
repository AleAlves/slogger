package com.github.android.aleson.slogger;

public class LogFactory {

    private static int ACTION;

    public static void action(int action) {
        ACTION = action;
    }

    public static String geData(Object data) {
        String parsedData;
        switch (ACTION) {
            case LogAction.INFO:
                break;
            case LogAction.WARN:
                break;
            case LogAction.ERROR:
                break;
            case LogAction.DEBUG:
                break;
            case LogAction.RESPONSE:
                break;
            default:
                break;
        }
        return "Test";
    }
}
