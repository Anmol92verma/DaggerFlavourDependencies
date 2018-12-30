package com.androidapps.dagger2flavours.injection.component

import com.androidapps.dagger2flavours.injection.module.ActivityModule
import com.androidapps.dagger2flavours.injection.module.AppModule
import com.androidapps.dagger2flavours.injection.module.FragmentModule
import com.androidapps.dagger2flavours.injection.module.IndiaAppModule
import dagger.Component

import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(IndiaAppModule::class,AppModule::class))
interface IndiaAppComponent {
    fun plusActivityComponent(activityModule: ActivityModule): ActivityComponent
    fun plusFragmentComponent(fragmentModule: FragmentModule): FragmentComponent
}