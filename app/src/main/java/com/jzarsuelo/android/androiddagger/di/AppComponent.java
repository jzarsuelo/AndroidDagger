package com.jzarsuelo.android.androiddagger.di;

import android.app.Application;

import com.jzarsuelo.android.androiddagger.AndroidDaggerApp;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

/**
 * TODO #4 - Create the AppComponent
 *
 * Created by Pao on 23/9/17.
 */
// TODO #4.1 - Define the depedencies for the application as singleton
@Singleton
// TODO #4.2 - Set the AppModule (#1), ActivityBuilder (#3), and AndroidInjectorModule (from dagger)
@Component(modules = {AppModule.class, ActivityBuilder.class, AndroidInjectionModule.class})
public interface AppComponent {

    // TODO #4.3 - Define the @Component.Builder interface
    @Component.Builder
    interface Builder {
        // TODO #4.4 - Bind the application of the application using @BindsInstance
        @BindsInstance Builder application(Application application);
        // TODO #4.5 - Define build():AppComponent
        AppComponent build();
    }

    // TODO #4.6 - Define inject(AndroidDaggerApp)
    void inject(AndroidDaggerApp app);
}
