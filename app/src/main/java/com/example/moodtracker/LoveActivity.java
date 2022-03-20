package com.example.moodtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoveActivity extends AppCompatActivity implements View.OnClickListener {
    private View
            peacefull_section,
            tenderness_section;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_love);

        // Initiating variables for the views
        peacefull_section = findViewById(R.id.love_peaceful_menu2);
        peacefull_section.setOnClickListener(this);

        tenderness_section = findViewById(R.id.love_tender_menu2);
        tenderness_section.setOnClickListener(this);




    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.love_peaceful_menu2:
                startActivity(new Intent(this, MoodSquaresActivity.class));
                break;
        }

    }



}