package com.example.noshin.cyride;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;

public class StopwatchActivity extends AppCompatActivity {

    private Chronometer chronometer;
    private long pauseoffset;
    private boolean running;
    TextView cycleId;
    Button stopBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stopwatch);

        chronometer = findViewById(R.id.chronometer);
        cycleId = findViewById(R.id.cycleId);
        cycleId.setText("Cycle ID : "+getIntent().getStringExtra("cycleId"));
        startChronometer();
        stopBtn = findViewById(R.id.stopBtn);

        stopBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               stopChronometer();
            }
        });
    }

    public void startChronometer(){
        if(!running){
            chronometer.setBase(SystemClock.elapsedRealtime() - pauseoffset);
            chronometer.start();
            running=true;
        }

    }

    public void stopChronometer(){
        if(running){
            chronometer.stop();
            pauseoffset=SystemClock.elapsedRealtime() - chronometer.getBase();
            running=false;
        }

    }


}
