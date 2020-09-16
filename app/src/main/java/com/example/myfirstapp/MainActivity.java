package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView onResumeText;
    TextView onStartText;
    TextView onCreateText;
    TextView onStopText;
    TextView onDestroyText;

    @Override
    protected void onStart() {
        onStartText = findViewById(R.id.onStartText);
        onStartText.setVisibility(View.VISIBLE);
        super.onStart();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        onCreateText = findViewById(R.id.onCreateText);
        onCreateText.setVisibility(View.VISIBLE);
    }

    @Override
    protected void onResume() {
        onResumeText = findViewById(R.id.onResumeText);
        onResumeText.setVisibility(View.VISIBLE);
        super.onResume();
    }
}



