package com.androidapps.dagger2flavours.injection.component

import com.androidapps.dagger2flavours.injection.module.ActivityModule
import com.androidapps.dagger2flavours.injection.module.AppModule
import com.androidapps.dagger2flavours.injection.module.FragmentModule
import com.androidapps.dagger2flavours.injection.module.PlanetXAppModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(PlanetXAppModule::class, AppModule::class))
interface PlanetXAppComponent {
    fun plusActivityComponent(activityModule: ActivityModule): ActivityComponent
    fun plusFragmentComponent(fragmentModule: FragmentModule): FragmentComponent
}