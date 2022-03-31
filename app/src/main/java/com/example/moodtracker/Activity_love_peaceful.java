package com.example.moodtracker;

import static com.example.moodtracker.R.color.attracted;
import static com.example.moodtracker.R.color.caring;
import static com.example.moodtracker.R.color.compassionate;
import static com.example.moodtracker.R.color.fondness;
import static com.example.moodtracker.R.color.infatuation;
import static com.example.moodtracker.R.color.passion;
import static com.example.moodtracker.R.color.relived;
import static com.example.moodtracker.R.color.romantic;
import static com.example.moodtracker.R.color.satisfied;
import static com.example.moodtracker.R.color.sentimental;
import static com.example.moodtracker.R.color.teal_200;
import static com.example.moodtracker.R.color.purple_700;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity_love_peaceful extends AppCompatActivity {

    private View topCard, bottomCard;
    private TextView topCardText, bottomCardText;
    private String submenuMood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_love_peaceful);

        // Top Card
        topCard = findViewById(R.id.love_submenu_submenu_top_card);
        // Top Card text
        topCardText = findViewById(R.id.love_submenu_submenu_top_text);

        // Bottom Card
        bottomCard = findViewById(R.id.love_submenu_submenu_bottom_card);
        // Bottom Card text
        bottomCardText = findViewById(R.id.love_submenu_submenu_bottom_text);

        // Mood Variable
        Bundle getMood = getIntent().getExtras();
        submenuMood = getMood.getString("key");

        moodChosen();



    }


    private void moodChosen(){
        if(submenuMood != null){
            switch (submenuMood){
                case "peaceful":
                    topCard.setBackgroundColor(getResources().getColor(relived));
                    topCardText.setText(R.string.relieved);

                    bottomCard.setBackgroundColor(getResources().getColor(satisfied));
                    bottomCardText.setText(R.string.satisfied);
                    break;

                case "tenderness":
                    topCard.setBackgroundColor(getResources().getColor(compassionate));
                    topCardText.setText(R.string.compassionate);

                    bottomCard.setBackgroundColor(getResources().getColor(caring));
                    bottomCardText.setText(R.string.caring);
                    break;

                case "desire":
                    topCard.setBackgroundColor(getResources().getColor(infatuation));
                    topCardText.setText(R.string.infatuation);

                    bottomCard.setBackgroundColor(getResources().getColor(passion));
                    bottomCardText.setText(R.string.passion);
                    break;

                case "longing":
                    topCard.setBackgroundColor(getResources().getColor(attracted));
                    topCardText.setText(R.string.attracted);

                    bottomCard.setBackgroundColor(getResources().getColor(sentimental));
                    bottomCardText.setText(R.string.sentimental);
                    break;

                case "affectionate":
                    topCard.setBackgroundColor(getResources().getColor(fondness));
                    topCardText.setText(R.string.fondness);

                    bottomCard.setBackgroundColor(getResources().getColor(romantic));
                    bottomCardText.setText(R.string.romantic);
                    break;
            }


        }

    }



}