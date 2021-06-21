package com.example.youtubeplayer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.youtube.player.YouTubeStandalonePlayer;


public class StandaloneActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standalone);

        Button btnPlayVideo=(Button)findViewById(R.id.btnPlayvideo);
        Button btnPlaylist=(Button)findViewById(R.id.btnPlaylist);

        btnPlayVideo.setOnClickListener(this);
        btnPlaylist.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent=null;

        switch (v.getId()){
            case R.id.btnPlayvideo:
                intent= YouTubeStandalonePlayer.createVideoIntent(this, Youtube.GOOGLE_API_KEY,Youtube.YOUTUBE_VIDEO_ID, 0,true, false);
                break;
            case R.id.btnPlaylist:
                intent=YouTubeStandalonePlayer.createPlaylistIntent(this, Youtube.GOOGLE_API_KEY,Youtube.YOUTUBE_PLAYLIST, 0, 0, true, true);
                break;
            default:
        }
        if(intent!=null){
            startActivity(intent);
        }











    }
}