package com.jzarsuelo.android.androiddagger.ui.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.jzarsuelo.android.androiddagger.R;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

/**
 * TODO #6 - Actual injection
 */
public class MainActivity extends AppCompatActivity
        implements MainView {

    // TODO #6.2 - Instance of MainPresenter will be injected. See #2.2
    @Inject
    MainPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO #6.1 - Inject the dependency of this Activity
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO #6.3 (-END-) - actual use of the injected dependency
        mPresenter.showHelloWorld();
    }

    @Override
    public void showToast(String s) {
        Toast.makeText(this, s, Toast.LENGTH_LONG).show();
    }
}
