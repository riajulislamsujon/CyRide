package com.example.noshin.cyride;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Chronometer;

public class StopwatchActivity extends AppCompatActivity {

    private Chronometer chronometer;
    private long pauseoffset;
    private boolean running;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stopwatch);

        chronometer = findViewById(R.id.chronometer);
    }

    public void startChronometer(View v){
        if(!running){
            chronometer.setBase(SystemClock.elapsedRealtime() - pauseoffset);
            chronometer.start();
            running=true;
        }

    }

    public void stopChronometer(View v){
        if(running){
            chronometer.stop();
            pauseoffset=SystemClock.elapsedRealtime() - chronometer.getBase();
            running=false;
        }

    }


}
