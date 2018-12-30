package com.androidapps.dagger2flavours.injection.module

import android.content.SharedPreferences
import com.androidapps.dagger2flavours.FlavourApplication
import com.androidapps.dagger2flavours.Functionality
import com.androidapps.dagger2flavours.FunctionalityChina
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ChinaAppModule(private val application: FlavourApplication) {

    @Provides
    @Singleton
    fun provideFunctionality(sharedPreferences: SharedPreferences): Functionality {
        return FunctionalityChina(application, sharedPreferences)
    }

}
