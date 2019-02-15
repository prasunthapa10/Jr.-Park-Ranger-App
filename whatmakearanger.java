package com.example.hoang.jrrangermain;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.hoang.jrrangermain.wmar.pic1;

public class whatmakearanger extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whatmakearanger);

        Button startwmar = findViewById(R.id.wmar);
        startwmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(whatmakearanger.this, pic1.class));
            }
        });
    }
}
