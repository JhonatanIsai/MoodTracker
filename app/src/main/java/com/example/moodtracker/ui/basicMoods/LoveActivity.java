/** ************************************************************************
 * For questions about code and other stuff regarding this file ask Jhonatan
 * *************************************************************************
 *  */

package com.example.moodtracker.ui.basicMoods;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.moodtracker.R;
import com.example.moodtracker.ui.OuterRingMoods;

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
    // Switch is used to redirect to and attach the needed parameters to for the new activity
    // which will display the appropriate mood in the outer ring of the mood circle.
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.love_peaceful_menu2:
                Intent peaceful = new Intent(this, OuterRingMoods.class);
                Bundle mood = new Bundle();
                mood.putString("key","peaceful");
                peaceful.putExtras(mood);
                startActivity(peaceful);
                break;

            case R.id.love_tender_menu2:
                Intent tender = new Intent(this, OuterRingMoods.class);
                Bundle tenderMood = new Bundle();
                tenderMood.putString("key","tenderness");
                tender.putExtras(tenderMood);
                startActivity(tender);
                break;

            case R.id.love_desire_menu2:
                Intent desire = new Intent(this, OuterRingMoods.class);
                Bundle desireMood = new Bundle();
                desireMood.putString("key","desire");
                desire.putExtras(desireMood);
                startActivity(desire);
                break;

            case R.id.love_longing_menu2:
                Intent longing = new Intent(this, OuterRingMoods.class);
                Bundle longingMood = new Bundle();
                longingMood.putString("key","longing");
                longing.putExtras(longingMood);
                startActivity(longing);
                break;
            case R.id.love_affectionate_menu2:
                Intent affectionate = new Intent(this, OuterRingMoods.class);
                Bundle affectionateMood = new Bundle();
                affectionateMood.putString("key","affectionate");
                affectionate.putExtras(affectionateMood);
                startActivity(affectionate);
                break;


        }
    }
}