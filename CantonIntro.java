package com.example.hoang.jrrangermain;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class CantonIntro extends AppCompatActivity {
    VideoView CantonV;
    Button click1;
    MediaController mc1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canton_intro);

        CantonV = findViewById(R.id.CantonVideo);
        click1 = findViewById(R.id.PlayButton1);
        mc1 = new MediaController(this);

    }

    public void playvideo1 (View v) {
        String path1 = "android.resource://" + getPackageName() + "/" + R.raw.canton;
        Uri uri1 = Uri.parse(path1);
        CantonV.setVideoURI(uri1);
        CantonV.setMediaController(mc1);
        mc1.setAnchorView(CantonV);
        CantonV.start();
    }

}
