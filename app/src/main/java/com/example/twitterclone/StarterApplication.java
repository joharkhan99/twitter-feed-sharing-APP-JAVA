package com.example.twitterclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseACL;

public class StarterApplication extends Application {

  @Override
  public void onCreate() {
    super.onCreate();

    Parse.enableLocalDatastore(this);

    Parse.initialize(new Parse.Configuration.Builder(this)
      .applicationId("LDR7bSLwtCe2DavTB0WpJddpyZ3W6p25GCiXMkxm")
      // if defined
      .clientKey("5hk3rrcOX0n7PBFC2n4TKED5GSv8nmstnHmagCrh")
      .server("https://parseapi.back4app.com")
      .build()
    );

//    ParseUser.enableAutomaticUser();    //creates automatic user

    ParseACL defaultACL = new ParseACL();
    defaultACL.setPublicReadAccess(true);
    defaultACL.setPublicWriteAccess(true);
    ParseACL.setDefaultACL(defaultACL, true);
  }
}
