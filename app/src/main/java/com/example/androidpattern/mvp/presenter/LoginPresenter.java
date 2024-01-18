package com.example.androidpattern.mvp.presenter;

import com.example.androidpattern.mvp.model.LoginModel;

public class LoginPresenter {
    LoginModel loginModel;
    LoginView loginView;

    public LoginPresenter(LoginModel loginModel, LoginView loginView) {
        this.loginModel = loginModel;
        this.loginView = loginView;
    }


    public void onLoginButtonCLicked(String username, String password) {
        boolean validUser = loginModel.isValidUser(username, password);
        loginView.showLoginResult(validUser);
    }

}
