package com.github.android.aleson.slogger;

public class LogFactory {

    private static int ACTION;
    private static final String CLASS_LABEL = " CLASS: ";
    private static final String METHOD_LABEL = " METHOD : ";
    private static final String LINE_LABEL = " LINE : ";
    private static final String STACK_TRACE = " STACK TRACE : ";
    private static final String ERROR_LABEL = " ERROR : ";
    private static final String WARN_LABEL = " WARN : ";
    private static final String INFO_LABEL = " INFO : ";
    private static final String DEBUG_LABEL = " DEBUG : ";
    private static String LABEL = " UNKNOW : ";
    private static final String NULL = "Null";
    private static final String PACKAGE_ID = "com.santander";
    private static final String SPACE = "   ";
    private static final String DOT = ".";
    private static final String SEPARATOR = "\n";
    private static final String DOUBLE_SEPARATOR = "\n\n";
    private static final String CLASS_INFO_NOT_FOUND = " * Class info not found! ";
    private static final String RESPONSE_BEGIN = DOUBLE_SEPARATOR + " BEGIN ------------------------------ " + SEPARATOR;
    private static final String RESPONSE_END = DOUBLE_SEPARATOR + "------------------------------ END" + DOUBLE_SEPARATOR;
    private static final String CLASS_USEFUL_INFO_NOT_FOUND = " * Could not found any useful data about the class! ";
    private static final String LOG_FAILED = " * Log Failed ";
    private static final String ENDPOINT_LOG = DOUBLE_SEPARATOR + "(Endpoint): ";
    private static final String METHOD_LOG = DOUBLE_SEPARATOR + "(Method): ";
    private static final String REPSONSE_LOG = SEPARATOR + "(Response):" + DOUBLE_SEPARATOR;

    public static void action(int action) {
        ACTION = action;
    }

    public static String geData(Object data) {
        String parsedData = LOG_FAILED;
        if (data == null) {
            parsedData = NULL;
        } else {
            switch (ACTION) {
                case LogAction.INFO:
                    LABEL = INFO_LABEL;
                    parsedData = logObjectData(data);
                    break;
                case LogAction.WARN:
                    LABEL = WARN_LABEL;
                    parsedData = logObjectData(data);
                    break;
                case LogAction.ERROR:
                    LABEL = ERROR_LABEL;
                    parsedData = getErrData(data);
                    break;
                case LogAction.DEBUG:
                    LABEL = DEBUG_LABEL;
                    parsedData = logObjectData(data);
                    break;
                default:
                    break;
            }
        }
        return parsedData;
    }

    public static String getResponseData(String url, String method, Object data) {
        LABEL = RESPONSE_BEGIN;
        return logResponse(url, method, data);
    }

    public static String logBeautify(String content) {
        try {
            if (content.contains("/>") || content.contains("</")) {
                return REPSONSE_LOG + content.replaceAll("><", ">\n<") + RESPONSE_END;
            }
            if (content.contains("{") && content.contains("}")) {
                content = content.replaceAll("\\{", "{\n");
                content = content.replaceAll("\\},", "},\n");
                content = content.replaceAll("\\}", "\n}");
                return REPSONSE_LOG + content + RESPONSE_END;
            }
            return content;
        } catch (Exception e) {
            return NULL;
        }
    }

    public static String logObjectData(Object object) {
        return javaClassInfo(getStackTrace()) +
                LABEL + logBeautify(object.toString());
    }

    private static String getErrData(Object object) {
        try {
            Exception exception = (Exception) object;
            return javaClassInfoFromException(exception) + SPACE +
                    (exception.getMessage() == null ? exception.toString() : exception.getMessage())
                    + SEPARATOR + STACK_TRACE + SEPARATOR + printStackTrace(exception);
        } catch (Exception e) {
            return logObjectData(object);
        }
    }

    private static String javaClassInfo(StackTraceElement stackTraceElement) {
        return stackTraceElement == null ? CLASS_INFO_NOT_FOUND :
                CLASS_LABEL +
                        stackTraceElement.getClassName() +
                        METHOD_LABEL +
                        stackTraceElement.getMethodName() +
                        LINE_LABEL +
                        stackTraceElement.getLineNumber();
    }

    private static String javaClassInfoFromException(Exception exception) {
        try {
            int stackUsefuldataIndex = getHelpfulClassIndex(exception.getStackTrace());
            return CLASS_LABEL +
                    exception.getStackTrace()[stackUsefuldataIndex].getClassName() +
                    METHOD_LABEL +
                    exception.getStackTrace()[stackUsefuldataIndex].getMethodName() +
                    LINE_LABEL +
                    exception.getStackTrace()[stackUsefuldataIndex].getLineNumber();
        } catch (Exception e) {
            return CLASS_USEFUL_INFO_NOT_FOUND;
        }
    }

    private static String printStackTrace(Exception exception) {
        String trace = "";
        for (StackTraceElement stackTraceElement : exception.getStackTrace()) {
            trace += stackTraceElement.getClassName() + DOT +
                    stackTraceElement.getMethodName() + DOT +
                    stackTraceElement.getLineNumber() + SEPARATOR;
        }
        return trace;
    }

    private static int getHelpfulClassIndex(StackTraceElement[] stackTrace) {
        for (int i = 0; i < stackTrace.length; i++) {
            if (stackTrace[i].getClassName().contains(PACKAGE_ID)) {
                return i;
            }
        }
        return 0;
    }

    private static StackTraceElement getStackTrace() {
        try {
            boolean achievedLoggerClass = false;
            StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
            for (int index = 0; index < stackTraceElements.length; index++) {
                if (!achievedLoggerClass &&
                        stackTraceElements[index].getClassName().contains(LogFactory.class.getName())) {
                    achievedLoggerClass = true;
                } else if (achievedLoggerClass &&
                        !stackTraceElements[index].getClassName().contains(LogFactory.class.getName())) {
                    return stackTraceElements[index];
                }
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    public static String logResponse(String url, String method, Object object) {
        return logEndpoint(url) +
                logMehtod(method) +
                logBeautify(object.toString());
    }


    private static String logEndpoint(String url) {
        return RESPONSE_BEGIN + ENDPOINT_LOG + url;
    }

    private static String logMehtod(String method) {
        return METHOD_LOG + method + SEPARATOR;
    }
}