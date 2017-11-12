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

        String url = "rtsp://r5---sn-a5meknle.googlevideo.com/Cj0LENy73wIaNAmXcvtiGP2DaBMYDSANFC36kAdaMOCoAUIASARgxqGD17T6sN5ZigELckNMQUtCSjlWNEUM/899F1E6E0F1E75CB48D4DB672DCDCAD08FB02575.0FE6220F953D25A42096A695D4643824CC95CB7F/yt6/1/video.3gp";
        videoView.setVideoURI(Uri.parse(url));

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);

        videoView.start();
    }
}
