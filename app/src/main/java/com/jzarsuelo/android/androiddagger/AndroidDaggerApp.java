package com.jzarsuelo.android.androiddagger;

import android.app.Activity;
import android.app.Application;


import com.jzarsuelo.android.androiddagger.di.DaggerAppComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

/**
 * TODO #5 - Using the child class of the Application, we inject the AppComponent and Activity dependecies
 *
 * Created by Pao on 23/9/17.
 */

// TODO #5.1 - Extend {@link Application} and implement {@link HasActivityInjector}
public class AndroidDaggerApp extends Application implements HasActivityInjector {

    // TODO #5.4 - Dispatch the Android Injector
    @Inject
    DispatchingAndroidInjector<Activity> activityDispatchingAndroidInjector;

    @Override
    public void onCreate() {
        super.onCreate();

        // TODO #5.2 - Inject the AppComponent (#4) dependencies
        DaggerAppComponent.builder()
                .application(this)
                .build()
                .inject(this);
    }

    // TODO #5.3 - Override activityInjector():AndroidInjector<Activity>
    @Override
    public AndroidInjector<Activity> activityInjector() {
        return activityDispatchingAndroidInjector;
    }
}
