package com.androidapps.dagger2flavours.injection.module

import android.content.SharedPreferences
import com.androidapps.dagger2flavours.ChinaDataProvider
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
    fun provideDataProvider(): ChinaDataProvider {
        return ChinaDataProvider()
    }

    @Provides
    @Singleton
    fun provideFunctionality(sharedPreferences: SharedPreferences,chinaDataProvider: ChinaDataProvider): Functionality {
        return FunctionalityChina(application, sharedPreferences,chinaDataProvider)
    }

}
