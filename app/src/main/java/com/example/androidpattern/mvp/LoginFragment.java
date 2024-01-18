package com.example.androidpattern.mvp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.androidpattern.R;
import com.example.androidpattern.mvp.model.LoginModel;
import com.example.androidpattern.mvp.presenter.LoginPresenter;
import com.example.androidpattern.mvp.view.LoginView;


public class LoginFragment extends Fragment implements LoginView {


    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;
    private LoginPresenter presenter;

    public LoginFragment() {
        // Required empty public constructor
    }


    public static LoginFragment newInstance() {
        LoginFragment fragment = new LoginFragment();
        Bundle args = new Bundle();
//        args.putString(ARG_PARAM1, param1);
//        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container, false);

        presenter = new LoginPresenter(new LoginModel(), this);

        view.findViewById(R.id.loginBtn).setOnClickListener(v -> {
            presenter.onLoginButtonCLicked("user123", "pass123");
        });

        return view;
    }


    @Override
    public void showLoginResult(boolean isSuccess) {
        if (isSuccess) {
            Toast.makeText(getContext(), "Login successful!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getContext(), "Invalid username or password. Please try again.", Toast.LENGTH_SHORT).show();
        }
    }


}