package com.example.hoang.jrrangermain;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class HowToPlay extends AppCompatActivity {
    VideoView video;
    Button click;
    MediaController mc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_to_play);

        click = findViewById(R.id.PlayButton);
        video = findViewById(R.id.welcomeVideo);
        mc = new MediaController(this);

    }
    public void playvideo (View v) {
        String path = "android.resource://" +getPackageName()+"/" + R.raw.welcome;
        Uri uri = Uri.parse(path);
        video.setVideoURI(uri);
        video.setMediaController(mc);
        mc.setAnchorView(video);
        video.start();
    }
}
