package com.androidapps.dagger2flavours.injection.module

import android.content.SharedPreferences
import com.androidapps.dagger2flavours.*
import dagger.Module
import dagger.Provides

@Module
class MercuryAppModule(val application: FlavourApplication) {

    @Provides
    @javax.inject.Singleton
    fun provideDataProvider():DataProviderSdk{
        return MercuryDataProvider()
    }
    @Provides
    fun provideFunctionality(sharedPreferences: SharedPreferences,mercuryDataProvider: MercuryDataProvider): Functionality {
        return FunctionalityMercury(application, sharedPreferences,mercuryDataProvider)
    }

}
