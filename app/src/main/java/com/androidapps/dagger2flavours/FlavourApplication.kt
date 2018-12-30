package com.androidapps.dagger2flavours

import android.app.Application
import com.androidapps.dagger2flavours.injection.DaggerComponentManager

class FlavourApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        DaggerComponentManager.initialize(this)
    }
}