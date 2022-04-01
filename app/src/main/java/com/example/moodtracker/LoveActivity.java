package com.example.moodtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoveActivity extends AppCompatActivity implements View.OnClickListener {
    private View
            peaceful_section, tenderness_section,
            desire_section, longing_section, affectionate_section
    ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_love);

        // Initiating variables for the views
        peaceful_section = findViewById(R.id.love_peaceful_menu2);
        peaceful_section.setOnClickListener(this);

        tenderness_section = findViewById(R.id.love_tender_menu2);
        tenderness_section.setOnClickListener(this);

        desire_section = findViewById(R.id.love_desire_menu2);
        desire_section.setOnClickListener(this);

        longing_section = findViewById(R.id.love_longing_menu2);
        longing_section.setOnClickListener(this);

        affectionate_section = findViewById(R.id.love_affectionate_menu2);
        affectionate_section.setOnClickListener(this);




    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.love_peaceful_menu2:
                Intent peaceful = new Intent(this, Activity_love_peaceful.class);
                Bundle mood = new Bundle();
                mood.putString("key","peaceful");
                peaceful.putExtras(mood);
                startActivity(peaceful);
                break;

            case R.id.love_tender_menu2:
                Intent tender = new Intent(this, Activity_love_peaceful.class);
                Bundle tenderMood = new Bundle();
                tenderMood.putString("key","tenderness");
                tender.putExtras(tenderMood);
                startActivity(tender);
                break;

            case R.id.love_desire_menu2:
                Intent desire = new Intent(this, Activity_love_peaceful.class);
                Bundle desireMood = new Bundle();
                desireMood.putString("key","desire");
                desire.putExtras(desireMood);
                startActivity(desire);
                break;

            case R.id.love_longing_menu2:
                Intent longing = new Intent(this, Activity_love_peaceful.class);
                Bundle longingMood = new Bundle();
                longingMood.putString("key","longing");
                longing.putExtras(longingMood);
                startActivity(longing);
                break;
            case R.id.love_affectionate_menu2:
                Intent affectionate = new Intent(this, Activity_love_peaceful.class);
                Bundle affectionateMood = new Bundle();
                affectionateMood.putString("key","affectionate");
                affectionate.putExtras(affectionateMood);
                startActivity(affectionate);
                break;


        }
    }
}