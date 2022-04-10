/** ************************************************************************
 * For questions about code and other stuff regarding this file ask Jhonatan
 * *************************************************************************
 *  */

package com.example.moodtracker.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.moodtracker.R;

public class JoyActivity extends AppCompatActivity implements View.OnClickListener {
    private View ethralled_section, elation_section, enthusiastic_section, optimistic_section,
            proud_section, cheerful_section, happy_section, content_section;

            ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joy);

        // Initiating variables for the views
        ethralled_section = findViewById(R.id.joy_enthralled_textView_menu2);
        ethralled_section.setOnClickListener(this);

        elation_section = findViewById(R.id.joy_elation_textView_menu2);
        elation_section.setOnClickListener(this);

        enthusiastic_section = findViewById(R.id.joy_enthusiastic_textView_menu2);
        enthusiastic_section.setOnClickListener(this);

        optimistic_section = findViewById(R.id.joy_optimistic_textView_menu2);
        optimistic_section.setOnClickListener(this);

        proud_section = findViewById(R.id.joy_proud_textView_menu2);
        proud_section.setOnClickListener(this);

        cheerful_section = findViewById(R.id.joy_cheerful_textView_menu2);
        cheerful_section.setOnClickListener(this);

        happy_section = findViewById(R.id.joy_happy_textView_menu2);
        happy_section.setOnClickListener(this);

        content_section = findViewById(R.id.joy_content_textView_menu2);
        content_section.setOnClickListener(this);
    }

    // Switch is used to redirect to and attach the needed parameters to for the new activity
    // which will display the appropriate mood in the outer ring of the mood circle.
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.joy_enthralled_textView_menu2:
                Intent enthralled = new Intent(this, OuterRingMoods.class);
                Bundle enthralledMood = new Bundle();
                enthralledMood.putString("key", "enthralled");
                enthralled.putExtras(enthralledMood);
                startActivity(enthralled);
                break;

            case R.id.joy_elation_textView_menu2:
                Intent elation = new Intent(this, OuterRingMoods.class);
                Bundle elationMood = new Bundle();
                elationMood.putString("key", "elation");
                elation.putExtras(elationMood);
                startActivity(elation);
                break;

            case R.id.joy_enthusiastic_textView_menu2:
                Intent enthusiastic = new Intent(this, OuterRingMoods.class);
                Bundle enthusiasticMood = new Bundle();
                enthusiasticMood.putString("key", "enthusiastic");
                enthusiastic.putExtras(enthusiasticMood);
                startActivity(enthusiastic);
                break;

            case R.id.joy_optimistic_textView_menu2:
                Intent optimistic = new Intent(this, OuterRingMoods.class);
                Bundle optimisticMood = new Bundle();
                optimisticMood.putString("key", "optimistic");
                optimistic.putExtras(optimisticMood);
                startActivity(optimistic);
                break;
            case R.id.joy_proud_textView_menu2:
                Intent proud = new Intent(this, OuterRingMoods.class);
                Bundle proudMood = new Bundle();
                proudMood.putString("key", "proud");
                proud.putExtras(proudMood);
                startActivity(proud);
                break;

            case R.id.joy_cheerful_textView_menu2:
                Intent cheerful = new Intent(this, OuterRingMoods.class);
                Bundle cheerfulMood = new Bundle();
                cheerfulMood.putString("key", "cheerful");
                cheerful.putExtras(cheerfulMood);
                startActivity(cheerful);
                break;

            case R.id.joy_happy_textView_menu2:
                Intent happy = new Intent(this, OuterRingMoods.class);
                Bundle happyMood = new Bundle();
                happyMood.putString("key", "happy");
                happy.putExtras(happyMood);
                startActivity(happy);
                break;

            case R.id.joy_content_textView_menu2:
                Intent content = new Intent(this, OuterRingMoods.class);
                Bundle contentMood = new Bundle();
                contentMood.putString("key", "content");
                content.putExtras(contentMood);
                startActivity(content);
                break;

        }
    }
}