package com.parse.integratingfacebooktutorial;

import android.app.Application;

import com.parse.Parse;

public class IntegratingFacebookTutorialApplication extends Application {

  static final String TAG = "MyApp";

  @Override
  public void onCreate() {
    super.onCreate();

    Parse.initialize(this, 
        "5BkOOyiVimxDnJBvfLGXbyxwe1YnXhaqS6eVi4NS",
        "iSveDzbZNyIOOmuh3iiXo0tr7Lqmf2xrcUktzvKA"
    );
  }
}
