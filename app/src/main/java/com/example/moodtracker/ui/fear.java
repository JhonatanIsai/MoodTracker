package com.example.moodtracker.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.moodtracker.R;

public class fear extends AppCompatActivity implements View.OnClickListener {

    private View horror_section, nervous_section, insecure_section, terror_section, scared_section;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fear);

        horror_section = findViewById(R.id.fear_horror_textView_menu2);
        horror_section.setOnClickListener(this);;


        nervous_section = findViewById(R.id.fear_nervous_textView_menu2);
        nervous_section.setOnClickListener(this);;


        insecure_section = findViewById(R.id.fear_insecure_textView_menu2);
        insecure_section.setOnClickListener(this);;

        terror_section = findViewById(R.id.fear_terror_textView_menu2);
        terror_section.setOnClickListener(this);;

        scared_section = findViewById(R.id.sadness_scared_textView_menu2);
        scared_section.setOnClickListener(this);;
    }

    // Switch is used to redirect to and attach the needed parameters to for the new activity
    // which will display the appropriate mood in the outer ring of the mood circle.


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.fear_horror_textView_menu2:
                Intent horror = new Intent(this, OuterRingMoods.class);
                Bundle horrorMood = new Bundle();
                horrorMood.putString("key", "horror");
                horror.putExtras(horrorMood);
                startActivity(horror);
                break;

            case R.id.fear_nervous_textView_menu2:
                Intent nervous = new Intent(this, OuterRingMoods.class);
                Bundle nervousMood = new Bundle();
                nervousMood.putString("key", "nervous");
                nervous.putExtras(nervousMood);
                startActivity(nervous);
                break;

            case R.id.fear_insecure_textView_menu2:
                Intent insecure = new Intent(this, OuterRingMoods.class);
                Bundle insecureMood = new Bundle();
                insecureMood.putString("key", "insecure");
                insecure.putExtras(insecureMood);
                startActivity(insecure);
                break;

            case R.id.fear_terror_textView_menu2:
                Intent terror = new Intent(this, OuterRingMoods.class);
                Bundle terrorMood = new Bundle();
                terrorMood.putString("key", "terror");
                terror.putExtras(terrorMood);
                startActivity(terror);
                break;
            case R.id.sadness_scared_textView_menu2:
                Intent scared = new Intent(this, OuterRingMoods.class);
                Bundle scaredMood = new Bundle();
                scaredMood.putString("key", "scared");
                scared.putExtras(scaredMood);
                startActivity(scared);
                break;
        }
    }
}