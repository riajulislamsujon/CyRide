package com.example.noshin.cyride;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.os.SystemClock;

public class firstscreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstscreen);
        SystemClock.sleep(3000);
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
        finish();
    }

}
