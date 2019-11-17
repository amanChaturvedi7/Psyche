package com.example.psyche;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {

    private TextView scoreTV;
    private Intent mIntent = new Intent();
    private int mScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        scoreTV = findViewById(R.id.tv_score);

        mIntent = getIntent();
        mScore = mIntent.getIntExtra("score", 0);
        scoreTV.setText("Your Score is: " + mScore);
    }
}
