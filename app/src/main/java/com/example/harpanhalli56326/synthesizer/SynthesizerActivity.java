package com.example.harpanhalli56326.synthesizer;

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
    private MediaPlayer mpA;
    private MediaPlayer mpB;
    private MediaPlayer mpC;
    private MediaPlayer mpD;
    private MediaPlayer mpE;
    private MediaPlayer mpF;
    private MediaPlayer mpG;

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
        mdButton = (Button)findViewById(R.id.dButton);
        mpD = MediaPlayer.create(this, R.raw.scaled);
        meButton = (Button)findViewById(R.id.eButton);
        mpE = MediaPlayer.create(this, R.raw.scalehighe);
        mfButton = (Button)findViewById(R.id.fButton);
        mpF = MediaPlayer.create(this, R.raw.scalehighf);
        mgButton = (Button)findViewById(R.id.gButton);
        mpG = MediaPlayer.create(this, R.raw.scalehighg);

        maButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mpA.seekTo(0);
                Log.e("SynthesizerActivity", "Button A clicked");
                mpA.start();
            }
        });

        mbButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mpB.seekTo(0);
                Log.e("SynthesizerActivity", "Button B clicked");
                mpB.start();
            }
        });

        mcButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mpC.seekTo(0);
                Log.e("SynthesizerActivity", "Button C clicked");
                mpC.start();
            }
        });

        mdButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mpD.seekTo(0);
                Log.e("SynthesizerActivity", "Button D clicked");
                mpD.start();
            }
        });

        meButton.setOnClickListener(new View.OnClickListener() {
          public void onClick(View v) {
              mpE.seekTo(0);
              Log.e("SynthesizerActivity", "Button E clicked");
              mpE.start();
          }
        });

        mfButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mpF.seekTo(0);
                Log.e("SynthesizerActivity", "Button F clicked");
                mpF.start();
            }
        });

        mgButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mpG.seekTo(0);
                Log.e("SynthesizerActivity", "Button G clicked");
                mpG.start();
            }
        });

    }
}
