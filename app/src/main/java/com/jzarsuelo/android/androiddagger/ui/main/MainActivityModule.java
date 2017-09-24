package com.jzarsuelo.android.androiddagger.ui.main;

import com.jzarsuelo.android.androiddagger.service.ApiService;

import dagger.Module;
import dagger.Provides;

/**
 *
 * Created by Pao on 23/9/17.
 *
 * TODO #2 - Create a "Module" that will "Provide" dependency to the View and Presenter
 */

// TODO #2.1 - Declare MainActivityModule as a @Module
@Module
public class MainActivityModule {

    // TODO #2.2 - Provides dependency to MainView.
    @Provides
    MainView provideMainView(MainActivity mainActivity) {
        return mainActivity;
    }

    // TODO #2.2 - Provides dependency to MainPresenter
    // params:
    //      MainView - dependency will come from #2.2 - MainActivityModule#provideMainView(MainActivity):MainView
    //      ApiService - dependency will from from #1.2 AppModule#provideApiService():ApiService

    @Provides
    MainPresenter provideMainPresenter(MainView mainView, ApiService apiService) {
        return new MainPresenterImpl(mainView, apiService);
    }

}
