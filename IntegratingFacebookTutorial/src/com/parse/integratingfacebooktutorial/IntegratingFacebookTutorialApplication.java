package com.parse.integratingfacebooktutorial;

import android.app.Application;

import com.parse.Parse;

public class IntegratingFacebookTutorialApplication extends Application {

  static final String TAG = "MyApp";

  @Override
  public void onCreate() {
    super.onCreate();

    Parse.initialize(this, 
        "YOUR_PARSE_APPLICATION_ID",
        "YOUR_PARSE_CLIENT_ID"
    );
  }
}
