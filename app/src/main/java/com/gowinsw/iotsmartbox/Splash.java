package com.gowinsw.iotsmartbox;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.ViewGroup;

import java.util.Timer;

/**
 * Created by gowinsw on 8/31/16.
 */


public class Splash extends Activity {



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        CountDownTimer cdTimer;
        Timer timer;

        Intent main = new Intent(Splash.this, Main.class);
        startActivity(main);
    }
}