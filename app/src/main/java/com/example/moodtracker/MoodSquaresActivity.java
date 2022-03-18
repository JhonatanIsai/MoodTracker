/** ************************************************************************
 * For questions about code and other stuff regarding this file ask Jhonatan
 * *************************************************************************
 *  */

package com.example.moodtracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MoodSquaresActivity extends AppCompatActivity implements View.OnClickListener {

    private View
            yello_love,
            green_joy,
            blue_surprise,
            red_anger,
            purple_sadness,
            orange_fear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mood_squares2);

        // Initiating variables for clickable color squares.
        yello_love = findViewById(R.id.yellow_love_view_moodSquares);
        yello_love.setOnClickListener(this);

        green_joy = findViewById(R.id.green_joy_view_moodSquares);
        green_joy.setOnClickListener(this);

        blue_surprise = findViewById(R.id.surprise_blue_view_moodSquares);
        blue_surprise.setOnClickListener(this);

        red_anger = findViewById(R.id.red_anger_view_moodSquares);
        red_anger.setOnClickListener(this);

        purple_sadness = findViewById(R.id.purple_sadness_view_moodSquares);
        purple_sadness.setOnClickListener(this);

        red_anger = findViewById(R.id.red_anger_view_moodSquares);
        red_anger.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {

        // I made all of this to redirect to the same activty because i have only made one so far
        switch (view.getId()){
            case R.id.yellow_love_view_moodSquares:
                startActivity(new Intent(this, LoveActivity.class));
            case R.id.green_joy_view_moodSquares:
                startActivity(new Intent(this, LoveActivity.class));
            case R.id.surprise_blue_view_moodSquares:
                startActivity(new Intent(this, LoveActivity.class));
            case R.id.red_anger_view_moodSquares:
                startActivity(new Intent(this, LoveActivity.class));
            case R.id.orange_fear_view_moodSquares:
                startActivity(new Intent(this, LoveActivity.class));

        }

    }
}