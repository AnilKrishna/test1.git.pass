package com.target.email;

//import android.app.Activity;
import android.os.Bundle;
import org.apache.cordova.*;

public class EmailPhoneGapActivityActivity extends DroidGap {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.main);
        super.loadUrl("file:///android_asset/www/index.html");
    }
}