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

public class SurpriseActivity extends AppCompatActivity implements View.OnClickListener {
    private View stunned_section, confused_section, amazed_section, overcome_section, moved_section;

    public SurpriseActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surprise);

        // each one of this are a different mood in the

        overcome_section = findViewById(R.id.surprise_overcome_textView_menu2);
        overcome_section.setOnClickListener(this);;


        amazed_section = findViewById(R.id.surprise_amazed_textView_menu2);
        amazed_section.setOnClickListener(this);;


        moved_section = findViewById(R.id.surprise_moved_textView_menu2);
        moved_section.setOnClickListener(this);;
        stunned_section = findViewById(R.id.surprise_stunned_textView_menu2);
        stunned_section.setOnClickListener(this);;

        confused_section = findViewById(R.id.surprise_confused_textView_menu2);
        confused_section.setOnClickListener(this);;
    }

    // Switch is used to redirect to and attach the needed parameters to for the new activity
    // which will display the appropriate mood in the outer ring of the mood circle.


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.surprise_stunned_textView_menu2:
                Intent stunned = new Intent(this, OuterRingMoods.class);
                Bundle stunnedMood = new Bundle();
                stunnedMood.putString("key", "stunned");
                stunned.putExtras(stunnedMood);
                startActivity(stunned);
                break;

            case R.id.surprise_confused_textView_menu2:
                Intent confused = new Intent(this, OuterRingMoods.class);
                Bundle confusedMood = new Bundle();
                confusedMood.putString("key", "confused");
                confused.putExtras(confusedMood);
                startActivity(confused);
                break;

            case R.id.surprise_amazed_textView_menu2:
                Intent amazed = new Intent(this, OuterRingMoods.class);
                Bundle amazedMood = new Bundle();
                amazedMood.putString("key", "amazed");
                amazed.putExtras(amazedMood);
                startActivity(amazed);
                break;

            case R.id.surprise_overcome_textView_menu2:
                Intent overcome = new Intent(this, OuterRingMoods.class);
                Bundle overcomeMood = new Bundle();
                overcomeMood.putString("key", "overcome");
                overcome.putExtras(overcomeMood);
                startActivity(overcome);
                break;
            case R.id.surprise_moved_textView_menu2:
                Intent moved = new Intent(this, OuterRingMoods.class);
                Bundle movedMood = new Bundle();
                movedMood.putString("key", "moved");
                moved.putExtras(movedMood);
                startActivity(moved);
                break;


        }
    }


}