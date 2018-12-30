package com.androidapps.dagger2flavours.injection.module

import com.androidapps.dagger2flavours.FlavourApplication
import com.androidapps.dagger2flavours.Functionality
import com.androidapps.dagger2flavours.FunctionalityIndia
import dagger.Module
import dagger.Provides

@Module
class IndiaAppModule(val application: FlavourApplication) : AppModule(application) {

    @Provides
    fun provideFunctionality(): Functionality {
        return FunctionalityIndia()
    }

}
