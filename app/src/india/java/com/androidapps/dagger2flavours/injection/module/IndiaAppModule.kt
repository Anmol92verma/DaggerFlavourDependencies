package com.androidapps.dagger2flavours.injection.module

import android.content.SharedPreferences
import com.androidapps.dagger2flavours.FlavourApplication
import com.androidapps.dagger2flavours.Functionality
import com.androidapps.dagger2flavours.FunctionalityIndia
import dagger.Module
import dagger.Provides

@Module
class IndiaAppModule(val application: FlavourApplication) {
    @Provides
    fun provideFunctionality(sharedPreferences: SharedPreferences): Functionality {
        return FunctionalityIndia(application, sharedPreferences)
    }

}
