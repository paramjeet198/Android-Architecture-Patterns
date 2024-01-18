package com.example.androidpattern;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.androidpattern.mvp.LoginFragment;
import com.example.androidpattern.mvp.presenter.LoginPresenter;
import com.example.androidpattern.mvp.view.LoginView;
import com.example.androidpattern.mvp.model.LoginModel;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        getSupportActionBar().setTitle("sadffjn");

    }


    public void mvpPattern(View view) {
        loadFragment(LoginFragment.newInstance());
    }

    void loadFragment(Fragment fragment) {

        FragmentTransaction transaction = getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.fragmentContainer, fragment);

        transaction.commit();

    }


}