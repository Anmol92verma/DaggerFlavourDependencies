package com.androidapps.dagger2flavours.injection

import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.androidapps.dagger2flavours.FlavourApplication
import com.androidapps.dagger2flavours.injection.component.*
import com.androidapps.dagger2flavours.injection.module.*

class DaggerComponentManager {

    companion object {
        var appComponent: PlanetXAppComponent? = null
        fun initialize(application: FlavourApplication) {
            appComponent = DaggerPlanetXAppComponent.builder()
                .planetXAppModule(PlanetXAppModule(application))
                .appModule(
                    AppModule(application))
                        .build()
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