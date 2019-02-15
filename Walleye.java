package com.example.hoang.jrrangermain;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.hoang.jrrangermain.walleyequiz.Quiz11;

public class Walleye extends AppCompatActivity {
    VideoView WalleyeV;
    Button click2;
    MediaController mc2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walleye);

        WalleyeV = findViewById(R.id.WalleyeVideo);
        click2 = findViewById(R.id.PlayButton2);
        mc2 = new MediaController(this);

    }

    public void playvideo2 (View v) {
        String path2 = "android.resource://" + getPackageName() + "/" + R.raw.walleyev;
        Uri uri2 = Uri.parse(path2);
        WalleyeV.setVideoURI(uri2);
        WalleyeV.setMediaController(mc2);
        mc2.setAnchorView(WalleyeV);
        WalleyeV.start();
    }

    public void launchQuiz (View view) {
        Intent intent = new Intent(this, Quiz11.class);
        startActivity(intent);
    }
}
