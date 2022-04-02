package com.example.moodtracker;

import static com.example.moodtracker.R.color.amused;
import static com.example.moodtracker.R.color.astonished;
import static com.example.moodtracker.R.color.astounded;
import static com.example.moodtracker.R.color.attracted;
import static com.example.moodtracker.R.color.awe_struck;
import static com.example.moodtracker.R.color.blissful;
import static com.example.moodtracker.R.color.caring;
import static com.example.moodtracker.R.color.compassionate;
import static com.example.moodtracker.R.color.delighted;
import static com.example.moodtracker.R.color.disillusioned;
import static com.example.moodtracker.R.color.dismayed;
import static com.example.moodtracker.R.color.eager;
import static com.example.moodtracker.R.color.enchanted;
import static com.example.moodtracker.R.color.euphoric;
import static com.example.moodtracker.R.color.exited;
import static com.example.moodtracker.R.color.fondness;
import static com.example.moodtracker.R.color.hopeful;
import static com.example.moodtracker.R.color.illustrious;
import static com.example.moodtracker.R.color.infatuation;
import static com.example.moodtracker.R.color.jovial;
import static com.example.moodtracker.R.color.jubilation;
import static com.example.moodtracker.R.color.passion;
import static com.example.moodtracker.R.color.perplexed;
import static com.example.moodtracker.R.color.pleased;
import static com.example.moodtracker.R.color.rapture;
import static com.example.moodtracker.R.color.relived;
import static com.example.moodtracker.R.color.romantic;
import static com.example.moodtracker.R.color.satisfied;
import static com.example.moodtracker.R.color.satisfied2;
import static com.example.moodtracker.R.color.sentimental;
import static com.example.moodtracker.R.color.shocked;
import static com.example.moodtracker.R.color.speechless;
import static com.example.moodtracker.R.color.stimulated;
import static com.example.moodtracker.R.color.teal_200;
import static com.example.moodtracker.R.color.purple_700;
import static com.example.moodtracker.R.color.touched;
import static com.example.moodtracker.R.color.triumphant;
import static com.example.moodtracker.R.color.zeal;


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


    /** This functions will change the text and colors of the file.
     * it will take string from the files of the second sub menu in the mood circle,
     * it will pass the string and with a switch the desired changes will be made.
     *
     * This files will changes the colors and names of the entire outer ring of the mood circle.
     * it will work for all the moods.
     * */
    private void moodChosen(){
        if(submenuMood != null){
            switch (submenuMood){

/**
 * This first section will make the changes pertaining to the moods in the LOVE submenu.
 * */
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
/**
 * This first section will make the changes pertaining to the moods in the JOY submenu.
 * */
                case "enthralled":
                    topCard.setBackgroundColor(getResources().getColor(rapture));
                    topCardText.setText(R.string.rapture);

                    bottomCard.setBackgroundColor(getResources().getColor(enchanted));
                    bottomCardText.setText(R.string.enchanted);
                    break;

                case "elation":
                    topCard.setBackgroundColor(getResources().getColor(jubilation));
                    topCardText.setText(R.string.jubilation);

                    bottomCard.setBackgroundColor(getResources().getColor(euphoric));
                    bottomCardText.setText(R.string.euphoric);
                    break;

                case "enthusiastic":
                    topCard.setBackgroundColor(getResources().getColor(zeal));
                    topCardText.setText(R.string.zeal);

                    bottomCard.setBackgroundColor(getResources().getColor(exited));
                    bottomCardText.setText(R.string.exited);
                    break;

                case "optimistic":
                    topCard.setBackgroundColor(getResources().getColor(hopeful));
                    topCardText.setText(R.string.hopeful);

                    bottomCard.setBackgroundColor(getResources().getColor(eager));
                    bottomCardText.setText(R.string.eager);
                    break;

                case "proud":
                    topCard.setBackgroundColor(getResources().getColor(illustrious));
                    topCardText.setText(R.string.illustrious);

                    bottomCard.setBackgroundColor(getResources().getColor(triumphant));
                    bottomCardText.setText(R.string.triumphant);
                    break;


                case "cheerful":
                    topCard.setBackgroundColor(getResources().getColor(blissful));
                    topCardText.setText(R.string.blissful);

                    bottomCard.setBackgroundColor(getResources().getColor(jovial));
                    bottomCardText.setText(R.string.jovial);
                    break;

                case "happy":
                    topCard.setBackgroundColor(getResources().getColor(delighted));
                    topCardText.setText(R.string.delighted);

                    bottomCard.setBackgroundColor(getResources().getColor(amused));
                    bottomCardText.setText(R.string.amused);
                    break;

                case "content":
                    topCard.setBackgroundColor(getResources().getColor(satisfied2));
                    topCardText.setText(R.string.satisfied);

                    bottomCard.setBackgroundColor(getResources().getColor(pleased));
                    bottomCardText.setText(R.string.pleased);
                    break;
//...................................................
                case "stunned":
                    topCard.setBackgroundColor(getResources().getColor(shocked));
                    topCardText.setText(R.string.shocked);

                    bottomCard.setBackgroundColor(getResources().getColor(dismayed));
                    bottomCardText.setText(R.string.dismayed);
                    break;
                case "confused":
                    topCard.setBackgroundColor(getResources().getColor(disillusioned));
                    topCardText.setText(R.string.disillusioned);

                    bottomCard.setBackgroundColor(getResources().getColor(perplexed));
                    bottomCardText.setText(R.string.perplexed);
                    break;
                case "amazed":
                    topCard.setBackgroundColor(getResources().getColor(astonished));
                    topCardText.setText(R.string.astonished);

                    bottomCard.setBackgroundColor(getResources().getColor(awe_struck));
                    bottomCardText.setText(R.string.awe_struck);
                    break;
                case "overcome":
                    topCard.setBackgroundColor(getResources().getColor(speechless));
                    topCardText.setText(R.string.speechless);

                    bottomCard.setBackgroundColor(getResources().getColor(astounded));
                    bottomCardText.setText(R.string.astounded);
                    break;
                case "moved":
                    topCard.setBackgroundColor(getResources().getColor(stimulated));
                    topCardText.setText(R.string.stimulated);

                    bottomCard.setBackgroundColor(getResources().getColor(touched));
                    bottomCardText.setText(R.string.touched);
                    break;



            }


        }

    }



}