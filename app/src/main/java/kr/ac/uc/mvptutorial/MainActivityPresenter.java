package kr.ac.uc.mvptutorial;

import android.util.Log;

public class MainActivityPresenter implements MainActivityContract.Presenter{
    MainActivityContract.View view;
    public MainActivityPresenter(MainActivityContract.View view){
        this.view = view;
    }

    @Override
    public void doLogin(String email, String password){
        if(email.equals("test@asd.com") && password.equals("1234")){
            view.onSuccess("Successful");
        }else{
            view.onError("Wrong email or pwd");
        }
    }
}
