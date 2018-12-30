package com.androidapps.dagger2flavours

import android.content.Context
import android.content.SharedPreferences
import android.util.Log

class FunctionalityplanetX(
    private val context: Context,
    private val sharedPreferences: SharedPreferences
) : Functionality {

    override fun init() {
        Log.d(this.javaClass.name, "init${BuildConfig.FLAVOR}")
    }

    override fun prepare() {
        Log.d(this.javaClass.name, "prepare${BuildConfig.FLAVOR}")
    }

    override fun execute() {
        Log.d(this.javaClass.name, "execute${BuildConfig.FLAVOR}")
    }

    override fun persist() {
        Log.d(this.javaClass.name, "persist${BuildConfig.FLAVOR}")
        sharedPreferences.edit().putString("key", "value").apply()
    }

    override fun delete() {
        Log.d(this.javaClass.name, "delete${BuildConfig.FLAVOR}")
    }

    override fun exit() {
        Log.d(this.javaClass.name, "exit${BuildConfig.FLAVOR}")
    }

}