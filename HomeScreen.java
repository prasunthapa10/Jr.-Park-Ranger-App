package com.example.hoang.jrrangermain;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class HomeScreen extends AppCompatActivity {
    private static final String LOG_TAG = HomeScreen.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
    }
    public void launchLakes(View view) {
            Log.d(LOG_TAG, "Button clicked!");

            Intent intent = new Intent(this, Lake.class);
            startActivity(intent);
    }

    public void launchHelp(View view) {
        Log.d(LOG_TAG, "Button clicked!");

        Intent intent = new Intent(this, Help.class);
        startActivity(intent);
    }

    public void launchCredits(View view) {
        Log.d(LOG_TAG, "Button clicked!");

        Intent intent = new Intent(this, Credits.class);
        startActivity(intent);
    }

    public void launchRanger(View view) {
        Log.d(LOG_TAG, "Button clicked!");

        Intent intent = new Intent(this, FindARanger.class);
        startActivity(intent);
    }

    public void launchHowtoplay(View view) {
        Log.d(LOG_TAG, "Button clicked!");

        Intent intent = new Intent(this, HowToPlay.class);
        startActivity(intent);
    }

}
