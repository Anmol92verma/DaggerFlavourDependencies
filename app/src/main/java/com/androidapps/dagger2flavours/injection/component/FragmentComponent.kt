package com.androidapps.dagger2flavours.injection.component

import com.androidapps.dagger2flavours.injection.module.FragmentModule
import com.androidapps.dagger2flavours.injection.scope.FragmentScope
import dagger.Subcomponent

@FragmentScope
@Subcomponent(modules = [(FragmentModule::class)])
interface FragmentComponent {
}
