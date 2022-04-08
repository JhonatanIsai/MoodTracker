package com.example.moodtracker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.media.session.MediaController;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

import java.net.MalformedURLException;
import java.net.URL;

public class VideoView extends AppCompatActivity {

    private YouTubePlayerView youTubePlayerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_view);

        youTubePlayerView =findViewById(R.id.youtube_video);
        getLifecycle().addObserver(youTubePlayerView);


        youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                // The ID is the vide ID from youtube
                // its the very last part after the equals sign "="
                // watch out for the ampersand, it may give issues

                super.onReady(youTubePlayer);
                String videoId = "VSMAjMfJ6KQ";
                youTubePlayer.loadVideo(videoId,0);

            }


        });
    }





}