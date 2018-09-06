package com.example.noshin.cyride;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class signup extends AppCompatActivity {


    private Button signupbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);


        signupbtn = (Button) findViewById(R.id.signup);

        signupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Sign Up Done Successfully", Toast.LENGTH_LONG);
                Intent intentsignup = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intentsignup);
                finish();
            }
        });
    }
}
