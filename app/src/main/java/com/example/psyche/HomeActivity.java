package com.example.psyche;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    private Button iaBtn, tmBtn, anxBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        iaBtn=findViewById(R.id.button);
        tmBtn=findViewById(R.id.button2);
        anxBtn=findViewById(R.id.button3);

        iaBtn.setOnClickListener(this);
        tmBtn.setOnClickListener(this);
        anxBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(HomeActivity.this, MainActivity.class);
        switch(v.getId()) {
            case R.id.button:
                i.putExtra("type", 0);
                startActivity(i);
                break;
            case R.id.button2:
                i.putExtra("type", 1);
                startActivity(i);
                break;
            case R.id.button3:
                i.putExtra("type", 2);
                startActivity(i);
                break;
        }
    }
}
