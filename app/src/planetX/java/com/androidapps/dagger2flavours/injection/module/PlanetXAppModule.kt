package com.androidapps.dagger2flavours.injection.module

import android.content.SharedPreferences
import com.androidapps.dagger2flavours.FlavourApplication
import com.androidapps.dagger2flavours.Functionality
import com.androidapps.dagger2flavours.FunctionalityplanetX
import dagger.Module
import dagger.Provides

@Module
class PlanetXAppModule(val application: FlavourApplication) {
    @Provides
    fun provideFunctionality(sharedPreferences: SharedPreferences): Functionality {
        return FunctionalityplanetX(application, sharedPreferences)
    }

}
