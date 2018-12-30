package com.androidapps.dagger2flavours.injection.component

import com.androidapps.dagger2flavours.injection.module.ActivityModule
import com.androidapps.dagger2flavours.injection.module.AppModule
import com.androidapps.dagger2flavours.injection.module.ChinaAppModule
import com.androidapps.dagger2flavours.injection.module.FragmentModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(ChinaAppModule::class, AppModule::class))
interface ChinaAppComponent {
    fun plusActivityComponent(activityModule: ActivityModule): ActivityComponent
    fun plusFragmentComponent(fragmentModule: FragmentModule): FragmentComponent
}