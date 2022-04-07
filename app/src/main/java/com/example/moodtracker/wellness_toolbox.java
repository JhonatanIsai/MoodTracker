package com.example.moodtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class wellness_toolbox extends AppCompatActivity implements View.OnClickListener{

    View breathing;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wellness_toolbox);

        breathing = findViewById(R.id.imageButton_breathe);
        breathing.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.imageButton_breathe:
                startActivity(new Intent(this, VideoView.class));
                break;
        }
    }
}