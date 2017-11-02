package com.example.harpanhalli56326.synthesizer;
import java.util.*;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.util.Log;

public class SynthesizerActivity extends AppCompatActivity {
    private static final String TAG = SynthesizerActivity.class.getName();
    private Button maButton;
    private Button mbButton;
    private Button mcButton;
    private Button mdButton;
    private Button meButton;
    private Button mfButton;
    private Button mgButton;
    private Button twinkleButton;
    private MediaPlayer mpA;
    private MediaPlayer mpB;
    private MediaPlayer mpC;
    private MediaPlayer mpCS;
    private MediaPlayer mpD;
    private MediaPlayer mpE;
    private MediaPlayer mpF;
    private MediaPlayer mpFS;
    private MediaPlayer mpG;
    private MediaPlayer silence;
    private ArrayList<MediaPlayer> twinkleFirst;
    private ArrayList<MediaPlayer> twinkleSecond;
    private final int WHOLE_NOTE = 800;

    private void delayPlaying(int delay) throws InterruptedException{
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            Log.e("SynthesizerActivity","Audio playback interrupted");
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synthesizer);

        maButton = (Button)findViewById(R.id.aButton);
        mpA = MediaPlayer.create(this, R.raw.scalea);
        mbButton = (Button)findViewById(R.id.bButton);
        mpB = MediaPlayer.create(this, R.raw.scaleb);
        mcButton = (Button)findViewById(R.id.cButton);
        mpC = MediaPlayer.create(this, R.raw.scalec);
        mpCS = MediaPlayer.create(this, R.raw.scalecs);
        mdButton = (Button)findViewById(R.id.dButton);
        mpD = MediaPlayer.create(this, R.raw.scaled);
        meButton = (Button)findViewById(R.id.eButton);
        mpE = MediaPlayer.create(this, R.raw.scalehighe);
        mfButton = (Button)findViewById(R.id.fButton);
        mpF = MediaPlayer.create(this, R.raw.scalehighf);
        mpFS = MediaPlayer.create(this, R.raw.scalehighfs);
        mgButton = (Button)findViewById(R.id.gButton);
        mpG = MediaPlayer.create(this, R.raw.scalehighg);
        twinkleButton = (Button)findViewById(R.id.twinkleButton);
        silence = MediaPlayer.create(this, R.raw.silence);

        twinkleFirst = new ArrayList<>();
        twinkleFirst.add(mpA);
        twinkleFirst.add(mpA);
        twinkleFirst.add(mpE);
        twinkleFirst.add(mpE);
        twinkleFirst.add(mpFS);
        twinkleFirst.add(mpFS);
        twinkleFirst.add(mpE);
        twinkleFirst.add(silence);
        twinkleFirst.add(mpD);
        twinkleFirst.add(mpD);
        twinkleFirst.add(mpCS);
        twinkleFirst.add(mpCS);
        twinkleFirst.add(mpB);
        twinkleFirst.add(mpB);
        twinkleFirst.add(mpA);
        twinkleFirst.add(silence);

        twinkleSecond = new ArrayList<>();
        twinkleSecond.add(mpE);
        twinkleSecond.add(mpE);
        twinkleSecond.add(mpD);
        twinkleSecond.add(mpD);
        twinkleSecond.add(mpCS);
        twinkleSecond.add(mpCS);
        twinkleSecond.add(mpB);
        twinkleSecond.add(silence);


        maButton.setOnClickListener(new View.OnClickListener() {
            private void delayPlaying(int delay) throws InterruptedException{
                try {
                    Thread.sleep(delay);
                } catch (InterruptedException e) {
                    Log.e("SynthesizerActivity","Audio playback interrupted");
                }
            }
            public void onClick(View v) {
                mpA.seekTo(0);
                Log.e("SynthesizerActivity", "Button A clicked");
                mpA.start();
            }
        });

        mbButton.setOnClickListener(new View.OnClickListener() {
            private void delayPlaying(int delay) throws InterruptedException{
                try {
                    Thread.sleep(delay);
                } catch (InterruptedException e) {
                    Log.e("SynthesizerActivity","Audio playback interrupted");
                }
            }
            public void onClick(View v) {
                mpB.seekTo(0);
                Log.e("SynthesizerActivity", "Button B clicked");
                mpB.start();
            }
        });

        mcButton.setOnClickListener(new View.OnClickListener() {
            private void delayPlaying(int delay) throws InterruptedException{
                try {
                    Thread.sleep(delay);
                } catch (InterruptedException e) {
                    Log.e("SynthesizerActivity","Audio playback interrupted");
                }
            }
            public void onClick(View v) {
                mpC.seekTo(0);
                Log.e("SynthesizerActivity", "Button C clicked");
                mpC.start();
            }
        });

        mdButton.setOnClickListener(new View.OnClickListener() {
            private void delayPlaying(int delay) throws InterruptedException{
                try {
                    Thread.sleep(delay);
                } catch (InterruptedException e) {
                    Log.e("SynthesizerActivity","Audio playback interrupted");
                }
            }
            public void onClick(View v) {
                mpD.seekTo(0);
                Log.e("SynthesizerActivity", "Button D clicked");
                mpD.start();
            }
        });

        meButton.setOnClickListener(new View.OnClickListener() {
            private void delayPlaying(int delay) throws InterruptedException{
                try {
                    Thread.sleep(delay);
                } catch (InterruptedException e) {
                    Log.e("SynthesizerActivity","Audio playback interrupted");
                }
            }
          public void onClick(View v) {
              mpE.seekTo(0);
              Log.e("SynthesizerActivity", "Button E clicked");
              mpE.start();
          }
        });

        mfButton.setOnClickListener(new View.OnClickListener() {
            private void delayPlaying(int delay) throws InterruptedException{
                try {
                    Thread.sleep(delay);
                } catch (InterruptedException e) {
                    Log.e("SynthesizerActivity","Audio playback interrupted");
                }
            }
            public void onClick(View v) {
                mpF.seekTo(0);
                Log.e("SynthesizerActivity", "Button F clicked");
                mpF.start();
            }
        });

        mgButton.setOnClickListener(new View.OnClickListener() {
            private void delayPlaying(int delay) throws InterruptedException{
                try {
                    Thread.sleep(delay);
                } catch (InterruptedException e) {
                    Log.e("SynthesizerActivity","Audio playback interrupted");
                }
            }
            public void onClick(View v) {
                mpG.seekTo(0);
                Log.e("SynthesizerActivity", "Button G clicked");
                mpG.start();
            }
        });


        twinkleButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                for(MediaPlayer note:twinkleFirst){
                    note.seekTo(0);
                    note.start();
                    try{
                        delayPlaying(WHOLE_NOTE);
                    } catch (InterruptedException e) {
                        Log.e("SynthesizerActivity","Audio playback interrupted");
                    }

                }
                for(MediaPlayer note: twinkleSecond){
                    note.seekTo(0);
                    note.start();
                    try{
                        delayPlaying(WHOLE_NOTE);
                    } catch (InterruptedException e) {
                        Log.e("SynthesizerActivity","Audio playback interrupted");
                    }
                }
                for(MediaPlayer note: twinkleSecond){
                    note.seekTo(0);
                    note.start();
                    try{
                        delayPlaying(WHOLE_NOTE);
                    } catch (InterruptedException e) {
                        Log.e("SynthesizerActivity","Audio playback interrupted");
                    }
                }
                for(MediaPlayer note:twinkleFirst){
                    note.seekTo(0);
                    note.start();
                    try{
                        delayPlaying(WHOLE_NOTE);
                    } catch (InterruptedException e) {
                        Log.e("SynthesizerActivity","Audio playback interrupted");
                    }

                }
                /*
                mpA.seekTo(0);
                mpA.start();
                mpA.seekTo(0);
                mpA.start();
                mpE.seekTo(0);
                mpE.start();
                mpE.seekTo(0);
                mpE.start();
                mpFS.seekTo(0);
                mpFS.start();
                mpFS.seekTo(0);
                mpFS.start();
                mpE.seekTo(0);
                mpE.start();
                mpD.seekTo(0);
                mpD.start();
                mpD.seekTo(0);
                mpD.start();
                mpCS.seekTo(0);
                mpCS.start();
                mpCS.seekTo(0);
                mpCS.start();
                mpB.seekTo(0);
                mpB.start();
                mpB.seekTo(0);
                mpB.start();
                mpA.seekTo(0);
                mpA.start();*/
            }
        });

    }
}
