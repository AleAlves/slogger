package br.com.safelogger.aleson.android.safelogger

import android.util.Log

class SfLogger {


    fun init(isDevEnviroment:Boolean){
        Log.d("SFLogger", "Init")
    }


    companion object {

        @JvmStatic
        fun e(tag:String, error:String){
            Log.e(tag, error)
        }
    }
}