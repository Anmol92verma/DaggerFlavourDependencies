package com.androidapps.dagger2flavours.injection.component;

import com.androidapps.dagger2flavours.injection.module.ActivityModule;
import com.androidapps.dagger2flavours.injection.module.AppModule;
import com.androidapps.dagger2flavours.injection.module.FragmentModule;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = {AppModule.class})
public interface ApplicationComponent {

    ActivityComponent plusActivityComponent(ActivityModule activityModule);

    FragmentComponent plusFragmentComponent(FragmentModule fragmentModule);


}
