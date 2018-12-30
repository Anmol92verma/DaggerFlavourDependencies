package com.androidapps.dagger2flavours.injection

import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.androidapps.dagger2flavours.FlavourApplication
import com.androidapps.dagger2flavours.injection.component.ActivityComponent
import com.androidapps.dagger2flavours.injection.component.ChinaAppComponent
import com.androidapps.dagger2flavours.injection.component.DaggerChinaAppComponent
import com.androidapps.dagger2flavours.injection.component.FragmentComponent
import com.androidapps.dagger2flavours.injection.module.ActivityModule
import com.androidapps.dagger2flavours.injection.module.AppModule
import com.androidapps.dagger2flavours.injection.module.ChinaAppModule
import com.androidapps.dagger2flavours.injection.module.FragmentModule

class DaggerComponentManager {

    companion object {
        var appComponent: ChinaAppComponent? = null
        fun initialize(application: FlavourApplication) {
            appComponent = DaggerChinaAppComponent.builder()
                .chinaAppModule(ChinaAppModule(application))
                .appModule(AppModule(application)
            ).build()
        }

        fun getActivityComponent(activity: AppCompatActivity): ActivityComponent {
            return appComponent?.plusActivityComponent(
                ActivityModule(activity)
            ) ?: throw IllegalStateException(
                "App Component is not initialized"
            )
        }

        fun getFragmentComponent(fragment: Fragment): FragmentComponent {
            return appComponent?.plusFragmentComponent(
                FragmentModule(fragment)
            ) ?: throw  IllegalStateException(
                "App Component is not initialized"
            )
        }
    }
}