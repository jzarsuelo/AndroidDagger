package com.jzarsuelo.android.androiddagger.di;

import android.app.Application;
import android.content.Context;

import com.jzarsuelo.android.androiddagger.service.ApiService;
import com.jzarsuelo.android.androiddagger.service.DbService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 *
 * Created by Pao on 23/9/17.
 *
 * TODO #1 - Create a "Module" that will "Provide" the dependency across the application.
 *
 */

// TODO #1.1 - Declare AppModule as a @Module
@Module
public class AppModule {

    // TODO #1.1 - provideContext
    @Provides
    @Singleton
    Context provideContext(Application application) {
        return application;
    }

    // TODO #1.2 - provideApiService
    @Provides
    @Singleton
    ApiService provideApiService() {
        return new ApiService();
    }

    /*@Provides
    @Singleton
    DbService provideDbService(Context context) {
        return new DbService(context);
    }
    */
}
