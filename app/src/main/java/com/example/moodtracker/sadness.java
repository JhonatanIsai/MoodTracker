package com.example.moodtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

// Make sure that we have the "implements View.OnClickListener"
public class sadness extends AppCompatActivity implements View.OnClickListener {

    private View despair_section, neglected_section, amazed_section, overcome_section, moved_section
            ,suffering_section;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sadness);


        // each one of this are a diffrent mood in the
        despair_section = findViewById(R.id.sadness_despair_textView_menu2);
        despair_section.setOnClickListener(this);;

        neglected_section = findViewById(R.id.sadness_neglectedtextView_menu2);
        neglected_section.setOnClickListener(this);;

        amazed_section = findViewById(R.id.sadness_shameful_textView_menu2);
        amazed_section.setOnClickListener(this);;

        overcome_section = findViewById(R.id.sadness_disappointment_textView_menu2);
        overcome_section.setOnClickListener(this);;

        moved_section = findViewById(R.id.sadness_sadness_textView_menu2);
        moved_section.setOnClickListener(this);

        suffering_section = findViewById(R.id.sadness_suffering_textView_menu2);
        suffering_section.setOnClickListener(this);


}

    // Switch is used to redirect to and attach the needed parameters to for the new activity
    // which will display the appropriate mood in the outer ring of the mood circle.

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.sadness_despair_textView_menu2:
                Intent despair = new Intent(this, OuterRingMoods.class);
                Bundle despairMood = new Bundle();
                despairMood.putString("key", "despair");
                despair.putExtras(despairMood);
                startActivity(despair);
                break;

            case R.id.sadness_neglectedtextView_menu2:
                Intent neglected = new Intent(this, OuterRingMoods.class);
                Bundle neglectedMood = new Bundle();
                neglectedMood.putString("key", "neglected");
                neglected.putExtras(neglectedMood);
                startActivity(neglected);
                break;

            case R.id.sadness_shameful_textView_menu2:
                Intent shameful = new Intent(this, OuterRingMoods.class);
                Bundle shamefulMood = new Bundle();
                shamefulMood.putString("key", "shameful");
                shameful.putExtras(shamefulMood);
                startActivity(shameful);
                break;

            case R.id.sadness_disappointment_textView_menu2:
                Intent disappointment = new Intent(this, OuterRingMoods.class);
                Bundle disappointmentMood = new Bundle();
                disappointmentMood.putString("key", "disappointment");
                disappointment.putExtras(disappointmentMood);
                startActivity(disappointment);
                break;
            case R.id.sadness_sadness_textView_menu2:
                Intent sadness = new Intent(this, OuterRingMoods.class);
                Bundle sadnessMood = new Bundle();
                sadnessMood.putString("key", "sadness");
                sadness.putExtras(sadnessMood);
                startActivity(sadness);
                break;

            case R.id.sadness_suffering_textView_menu2:
                Intent suffering = new Intent(this, OuterRingMoods.class);
                Bundle sufferingMood = new Bundle();
                sufferingMood.putString("key", "suffering");
                suffering.putExtras(sufferingMood);
                startActivity(suffering);
                break;


        }
    }

}