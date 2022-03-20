/** ************************************************************************
 * For questions about code and other stuff regarding this file ask Jhonatan
 * *************************************************************************
 *  */

package com.example.moodtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MoodSquaresActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mood_squares2);

        // ***************  Initiating variables for clickable color squares. **************
        // Clickable area for mood love, color: yellow
        Button yello_love = findViewById(R.id.mood_square_love_button);
        yello_love.setOnClickListener(this);

        // clickable area mood joy, color: green
        Button green_joy = findViewById(R.id.mood_square_joy_button);
        green_joy.setOnClickListener(this);
        // clickable area mood surprise, color:blue
        Button blue_surprise = findViewById(R.id.mood_square_surprise_button);
        blue_surprise.setOnClickListener(this);

        // clickable area mood anger, color: red
        Button red_anger = findViewById(R.id.mood_square_anger_button);
        red_anger.setOnClickListener(this);

        // clickable area mood sadness, color: purple
        Button purple_sadness = findViewById(R.id.mood_square_sadness_button);
        purple_sadness.setOnClickListener(this);

        // clickable area mood fear, color: orange
        View orange_fear = findViewById(R.id.mood_square_fear_button);
        orange_fear.setOnClickListener(this);
    }
    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {

        // I made all of this to redirect to the same activity because i have only made one so far
        switch (view.getId()){
            case R.id.mood_square_love_button:
//                startActivity(new Intent(MoodSquaresActivity.this, JoyActivity.class));
                startActivity(new Intent(MoodSquaresActivity.this, LoveActivity.class));
                break;

            case R.id.mood_square_joy_button:
                startActivity(new Intent(MoodSquaresActivity.this, JoyActivity.class));
                break;

            case R.id.mood_square_surprise_button:
                startActivity(new Intent(MoodSquaresActivity.this, SurpriseActivity.class));
                break;
        }

    }
}