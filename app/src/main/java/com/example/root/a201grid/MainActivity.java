package com.example.root.a201grid;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;

public class MainActivity extends AppCompatActivity {
    private AlphaAnimation buttonClick = new AlphaAnimation(1F, 0.8F);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonTaped(View view) {
        view.startAnimation(buttonClick);
        int id = view.getId();
        String ourId = "";

        ourId = view.getResources().getResourceEntryName(id);

        int resourceId = getResources().getIdentifier(ourId, "raw", "com.example.root.a201grid");

        MediaPlayer mPlayer = MediaPlayer.create(this, resourceId);
        if(mPlayer.isPlaying()){
            mPlayer.stop();
        }else {
            mPlayer.start();
        }

//        int id = view.getId();
//        MediaPlayer mediaPlayer = null;
//        switch(id){
//            case R.id.hello:
//                mediaPlayer = MediaPlayer.create(this, R.raw.hello);
//                if(mediaPlayer.isPlaying()){
//                    mediaPlayer.stop();
//                }else{
//                    mediaPlayer.start();
//                }
//                break;
//            case R.id.howareyou:
//                mediaPlayer = MediaPlayer.create(this, R.raw.howareyou);
//                if(mediaPlayer.isPlaying()){
//                    mediaPlayer.stop();
//                }else{
//                    mediaPlayer.start();
//                }
//                break;
//            case R.id.goodevening:
//                mediaPlayer = MediaPlayer.create(this, R.raw.goodevening);
//                if(mediaPlayer.isPlaying()){
//                    mediaPlayer.stop();
//                }else{
//                    mediaPlayer.start();
//                }
//                break;
//            case R.id.mynameis:
//                mediaPlayer = MediaPlayer.create(this, R.raw.mynameis);
//                if(mediaPlayer.isPlaying()){
//                    mediaPlayer.stop();
//                }else{
//                    mediaPlayer.start();
//                }
//                break;
//            case R.id.ilivein:
//                mediaPlayer = MediaPlayer.create(this, R.raw.ilivein);
//                if(mediaPlayer.isPlaying()){
//                    mediaPlayer.stop();
//                }else{
//                    mediaPlayer.start();
//                }
//                break;
//            case R.id.doyouspeakenglish:
//                mediaPlayer = MediaPlayer.create(this, R.raw.doyouspeakenglish);
//                if(mediaPlayer.isPlaying()){
//                    mediaPlayer.stop();
//                }else{
//                    mediaPlayer.start();
//                }
//                break;
//            case R.id.please:
//                mediaPlayer = MediaPlayer.create(this, R.raw.please);
//                if(mediaPlayer.isPlaying()){
//                    mediaPlayer.stop();
//                }else{
//                    mediaPlayer.start();
//                }
//                break;
//            case R.id.welcome:
//                mediaPlayer = MediaPlayer.create(this, R.raw.welcome);
//                if(mediaPlayer.isPlaying()){
//                    mediaPlayer.stop();
//                }else{
//                    mediaPlayer.start();
//                }
//                break;
//        }
    }
}
