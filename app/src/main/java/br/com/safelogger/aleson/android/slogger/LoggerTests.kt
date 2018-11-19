package br.com.safelogger.aleson.android.slogger

import br.com.safelogger.aleson.android.safelogger.SfLogger

class LoggerTests {

    fun LoggerTests(){
        val sfLogger = SfLogger()
        sfLogger.init(true)
        SfLogger.e("SFLogger", "Test")
        SfLogger.e("SFLogger", "Test")
    }

}