package com.example.moodtracker.ui.basicMoods;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.moodtracker.R;
import com.example.moodtracker.ui.OuterRingMoods;

public class AngerActivity extends AppCompatActivity implements View.OnClickListener {

    private View disgust_section, envy_section, irritable_section, exasperated_section, rage_section;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anger);

        disgust_section = findViewById(R.id.anger_disgust_textView_menu2);
        disgust_section.setOnClickListener(this);;


        envy_section = findViewById(R.id.anger_envytextView_menu2);
        envy_section.setOnClickListener(this);;


        irritable_section = findViewById(R.id.anger_irritable_textView_menu2);
        irritable_section.setOnClickListener(this);;

        exasperated_section = findViewById(R.id.anger_exasperated_textView_menu2);
        exasperated_section.setOnClickListener(this);;

        rage_section = findViewById(R.id.anger_rage_textView_menu2);
        rage_section.setOnClickListener(this);;
    }

    // Switch is used to redirect to and attach the needed parameters to for the new activity
    // which will display the appropriate mood in the outer ring of the mood circle.


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.anger_disgust_textView_menu2:
                Intent disgust = new Intent(this, OuterRingMoods.class);
                Bundle disgustMood = new Bundle();
                disgustMood.putString("key", "stunned");
                disgust.putExtras(disgustMood);
                startActivity(disgust);
                break;

            case R.id.anger_envytextView_menu2:
                Intent envy = new Intent(this, OuterRingMoods.class);
                Bundle envyMood = new Bundle();
                envyMood.putString("key", "envy");
                envy.putExtras(envyMood);
                startActivity(envy);
                break;

            case R.id.anger_irritable_textView_menu2:
                Intent irritable = new Intent(this, OuterRingMoods.class);
                Bundle irritableMood = new Bundle();
                irritableMood.putString("key", "irritable");
                irritable.putExtras(irritableMood);
                startActivity(irritable);
                break;

            case R.id.anger_exasperated_textView_menu2:
                Intent exasperated = new Intent(this, OuterRingMoods.class);
                Bundle exasperatedMood = new Bundle();
                exasperatedMood.putString("key", "exasperated");
                exasperated.putExtras(exasperatedMood);
                startActivity(exasperated);
                break;
            case R.id.anger_rage_textView_menu2:
                Intent rage = new Intent(this, OuterRingMoods.class);
                Bundle rageMood = new Bundle();
                rageMood.putString("key", "rage");
                rage.putExtras(rageMood);
                startActivity(rage);
                break;
        }
    }
}