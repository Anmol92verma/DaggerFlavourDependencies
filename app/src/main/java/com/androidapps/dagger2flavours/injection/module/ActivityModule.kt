package com.androidapps.dagger2flavours.injection.module

import android.content.Context
import android.support.v7.app.AppCompatActivity
import com.androidapps.dagger2flavours.injection.qualifiers.ActivityContext
import com.androidapps.dagger2flavours.injection.scope.ActivityScope
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(val activity: AppCompatActivity) {

  @Provides
  @ActivityScope
  @ActivityContext
  fun provideContext(): Context {
    return activity
  }

  @Provides
  @ActivityScope
  fun provideAppCompatActivity(): AppCompatActivity {
    return activity
  }

}
