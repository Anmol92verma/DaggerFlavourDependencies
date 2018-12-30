package com.androidapps.dagger2flavours.injection.component

import com.androidapps.dagger2flavours.MainActivity
import com.androidapps.dagger2flavours.injection.module.ActivityModule
import com.androidapps.dagger2flavours.injection.scope.ActivityScope
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = [(ActivityModule::class)])
interface ActivityComponent {
  fun inject(activity: MainActivity)
}
