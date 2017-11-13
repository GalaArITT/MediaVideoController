package com.example.oliver.mediavideocontroller;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final VideoView videoView = (VideoView) findViewById(R.id.videoView);
        //m.youtube.com/watch?v=VIDEO_ID&app=m
        //https://www.youtube.com/watch?v=aIP9GGL7cpc
        //http://www.ebookfrenzy.com/android_book/nature.mp4
        String url ="rtsp://r5---sn-q4flrnek.googlevideo.com/Cj0LENy73wIaNAmXcvtiGP2DaBMYDSANFC0HqglaMOCoAUIASARgxqGD17T6sN5ZigELckNMQUtCSjlWNEUM/864B95CE0F5A55DD679AD493576F60A9AE49B2A4.0D02E752FE3F3AC50C9902AC7AC549C739C0E4C5/yt6/1/video.3gp";

        videoView.setVideoURI(Uri.parse(url));

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);

        videoView.start();
    }
}
