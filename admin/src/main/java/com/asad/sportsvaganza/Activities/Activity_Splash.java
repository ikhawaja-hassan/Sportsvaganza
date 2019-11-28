package com.asad.sportsvaganza.Activities;

import
        androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.asad.sportsvaganza.R;

public class Activity_Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        new Handler().postDelayed(new Runnable() {


            @Override

            public void run() {

                Intent i = new Intent(Activity_Splash.this, Activity_Login_Main.class);

                startActivity(i);

                // close this activity

                finish();

            }

        }, 3*1000);
        setContentView(R.layout.activity_splash);
    }

}
