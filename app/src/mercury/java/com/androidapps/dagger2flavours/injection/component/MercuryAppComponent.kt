package com.androidapps.dagger2flavours.injection.component

import com.androidapps.dagger2flavours.injection.module.*
import dagger.Component

import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(MercuryAppModule::class,AppModule::class))
interface MercuryAppComponent {
    fun plusActivityComponent(activityModule: ActivityModule): ActivityComponent
    fun plusFragmentComponent(fragmentModule: FragmentModule): FragmentComponent
}