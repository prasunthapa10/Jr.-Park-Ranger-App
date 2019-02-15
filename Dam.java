package com.example.hoang.jrrangermain;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.hoang.jrrangermain.damquiz.Quiz21;

public class Dam extends AppCompatActivity {
    VideoView DamV;
    Button click3;
    MediaController mc3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dam);

        DamV = findViewById(R.id.DamVideo);
        click3 = findViewById(R.id.PlayButton3);
        mc3 = new MediaController(this);

        Button damquiz = findViewById(R.id.damquiz);
        damquiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dam.this, Quiz21.class));
            }
        });

    }

    public void playvideo3 (View v) {
        String path3 = "android.resource://" + getPackageName() + "/" + R.raw.damv;
        Uri uri3 = Uri.parse(path3);
        DamV.setVideoURI(uri3);
        DamV.setMediaController(mc3);
        mc3.setAnchorView(DamV);
        DamV.start();
    }
}
