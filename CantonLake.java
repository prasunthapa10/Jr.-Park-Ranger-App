package com.example.hoang.jrrangermain;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class CantonLake extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canton_lake);

        Button home = findViewById(R.id.homecreen);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CantonLake.this, HomeScreen.class));
            }
        });

    }

    public void launchCamping(View view) {

        Intent intent = new Intent(this, Camping.class);
        startActivity(intent);
    }

    public void launchDam(View view) {

        Intent intent = new Intent(this, Dam.class);
        startActivity(intent);
    }

    public void launchWalleye(View view) {

        Intent intent = new Intent(this, Walleye.class);
        startActivity(intent);
    }

    public void launchWmar(View view) {

        Intent intent = new Intent(this, whatmakearanger.class);
        startActivity(intent);
    }

    public void launchIntro(View view) {

        Intent intent = new Intent(this, CantonIntro.class);
        startActivity(intent);
    }
}
