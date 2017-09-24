package com.jzarsuelo.android.androiddagger.di;

import com.jzarsuelo.android.androiddagger.ui.main.MainActivity;
import com.jzarsuelo.android.androiddagger.ui.main.MainActivityModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 *
 * Created by Pao on 23/9/17.
 *
 * TODO #3 - Map Activities to ActivityBuilder
 */

// TODO #3.1 - Declare ActivityBuilder as a @Module
@Module
public abstract class ActivityBuilder {

    // TODO #3.2 - Map the Activity to the Builder
    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity bindMainActivity();

}
