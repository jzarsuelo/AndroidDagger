package com.jzarsuelo.android.androiddagger.ui.main;

import com.jzarsuelo.android.androiddagger.service.ApiService;

/**
 * Created by Pao on 23/9/17.
 */

public class MainPresenterImpl implements MainPresenter {


    private final MainView mView;

    public MainPresenterImpl(MainView mainView, ApiService apiService) {
        mView = mainView;
    }

    @Override
    public void showHelloWorld() {
        mView.showToast("Hello World!");
    }
}
