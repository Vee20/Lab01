package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class VRActivity extends AppCompatActivity {

    TextView onStartText;
    TextView onCreateText;
    TextView onStopText;
    TextView onDestroyText;

    @Override
    protected void onStart() {
        onStartText = findViewById(R.id.onStart2);
        onStartText.setVisibility(View.VISIBLE);
        super.onStart();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v_r);

        onCreateText = findViewById(R.id.onCreate1);
        onCreateText.setVisibility(View.VISIBLE);
    }

    @Override
    protected void onStop(){
        onStopText = findViewById(R.id.onStop3);
        onStopText.setVisibility(View.VISIBLE);
        super.onStop();
    }

    @Override
    protected void onDestroy(){
        onDestroyText = findViewById(R.id.onDestroy4);
        onDestroyText.setVisibility(View.VISIBLE);
        super.onDestroy();
    }
}