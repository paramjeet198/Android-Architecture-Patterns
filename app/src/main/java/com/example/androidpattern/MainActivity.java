package com.example.androidpattern;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import com.example.androidpattern.mvp.view.LoginFragment;

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

    // MVC Pattern:
    // View: Views like TextView & Buttons etc;
    // Model: DataModel Class
    // Controller: Activity/Fragments

    // MVP Pattern:
    // View: Activity with views;
    // Model: DataModel Class
    // Presenter: Presenter Class with its helper contract/view interfaces.

}