package com.crooks.android_youtubeplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class StandAloneActivity extends AppCompatActivity
        implements View.OnClickListener {

    private String GOOGLE_API_KEY = "AIzaSyB411ESm1JElSTAyzJ_OhemMkIu4-aWerc";
    private String YOUTUBE_VIDEO_ID = "CTAud5O7Qqk";
    private String YOUTUBE_PLAYLIST = "TBA";
    private Button btnPlayVideo;
    private Button btnPlayPlayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stand_alone);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnPlayVideo = (Button) findViewById(R.id.btnPlayVideo);
        btnPlayPlayList = (Button) findViewById(R.id.btnPlayPlaylist);

        btnPlayVideo.setOnClickListener(this);
        btnPlayPlayList.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch(v.getId()){

        }
    }
}
