package com.github.android.aleson.slogger;

import android.support.annotation.IntDef;

import static com.github.android.aleson.slogger.LogAction.*;

@IntDef({INFO, WARN, ERROR, DEBUG, RESPONSE})
public @interface LogAction {
    int INFO = 1;
    int WARN = 2;
    int ERROR = 3;
    int DEBUG = 4;
    int RESPONSE = 5;
}

