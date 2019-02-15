package com.example.hoang.jrrangermain;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Lake extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lake);
    }

    public void launchCanton(View view) {
        Intent intent = new Intent(this, CantonLake.class);
        startActivity(intent);
    }
}
