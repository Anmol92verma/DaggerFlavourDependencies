package com.androidapps.dagger2flavours.injection.module

import android.content.SharedPreferences
import com.androidapps.dagger2flavours.FlavourApplication
import com.androidapps.dagger2flavours.Functionality
import com.androidapps.dagger2flavours.FunctionalityplanetX
import com.androidapps.dagger2flavours.PlanetXDataProvider
import dagger.Module
import dagger.Provides

@Module
class PlanetXAppModule(val application: FlavourApplication) {

    @Provides
    @javax.inject.Singleton
    fun provideDataProvider(): PlanetXDataProvider {
        return PlanetXDataProvider()
    }

    @Provides
    fun provideFunctionality(sharedPreferences: SharedPreferences,planetXDataProvider: PlanetXDataProvider): Functionality {
        return FunctionalityplanetX(application,planetXDataProvider, sharedPreferences)
    }

}
