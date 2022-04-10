/**
 * ***********************************************************************
 * For questions about code and other stuff regarding this file ask Jhonatan
 * *************************************************************************
 */

package com.example.moodtracker;

import static com.example.moodtracker.R.color.Aggravated;
import static com.example.moodtracker.R.color.Agony;
import static com.example.moodtracker.R.color.agitated;
import static com.example.moodtracker.R.color.amused;
import static com.example.moodtracker.R.color.annoyed;
import static com.example.moodtracker.R.color.anxious;
import static com.example.moodtracker.R.color.astonished;
import static com.example.moodtracker.R.color.astounded;
import static com.example.moodtracker.R.color.attracted;
import static com.example.moodtracker.R.color.awe_struck;
import static com.example.moodtracker.R.color.blissful;
import static com.example.moodtracker.R.color.caring;
import static com.example.moodtracker.R.color.compassionate;
import static com.example.moodtracker.R.color.contempt;
import static com.example.moodtracker.R.color.delighted;
import static com.example.moodtracker.R.color.depressed;
import static com.example.moodtracker.R.color.disillusioned;
import static com.example.moodtracker.R.color.dismayed;
import static com.example.moodtracker.R.color.dismayed2;
import static com.example.moodtracker.R.color.displeased;
import static com.example.moodtracker.R.color.dread;
import static com.example.moodtracker.R.color.eager;
import static com.example.moodtracker.R.color.enchanted;
import static com.example.moodtracker.R.color.euphoric;
import static com.example.moodtracker.R.color.exited;
import static com.example.moodtracker.R.color.fondness;
import static com.example.moodtracker.R.color.frightened;
import static com.example.moodtracker.R.color.frustrated;
import static com.example.moodtracker.R.color.grief;
import static com.example.moodtracker.R.color.guilty;
import static com.example.moodtracker.R.color.helpless;
import static com.example.moodtracker.R.color.hopeful;
import static com.example.moodtracker.R.color.hurt;
import static com.example.moodtracker.R.color.hysterical;
import static com.example.moodtracker.R.color.illustrious;
import static com.example.moodtracker.R.color.inadequate;
import static com.example.moodtracker.R.color.infatuation;
import static com.example.moodtracker.R.color.inferior;
import static com.example.moodtracker.R.color.isolated;
import static com.example.moodtracker.R.color.jealous;
import static com.example.moodtracker.R.color.jovial;
import static com.example.moodtracker.R.color.jubilation;
import static com.example.moodtracker.R.color.lonely;
import static com.example.moodtracker.R.color.mortified;
import static com.example.moodtracker.R.color.panic;
import static com.example.moodtracker.R.color.passion;
import static com.example.moodtracker.R.color.perplexed;
import static com.example.moodtracker.R.color.pleased;
import static com.example.moodtracker.R.color.powerless;
import static com.example.moodtracker.R.color.rapture;
import static com.example.moodtracker.R.color.regretful;
import static com.example.moodtracker.R.color.relived;
import static com.example.moodtracker.R.color.resentful;
import static com.example.moodtracker.R.color.revolt;
import static com.example.moodtracker.R.color.romantic;
import static com.example.moodtracker.R.color.satisfied;
import static com.example.moodtracker.R.color.satisfied2;
import static com.example.moodtracker.R.color.sentimental;
import static com.example.moodtracker.R.color.shocked;
import static com.example.moodtracker.R.color.sorrow;
import static com.example.moodtracker.R.color.speechless;
import static com.example.moodtracker.R.color.stimulated;
import static com.example.moodtracker.R.color.touched;
import static com.example.moodtracker.R.color.triumphant;
import static com.example.moodtracker.R.color.worried;
import static com.example.moodtracker.R.color.zeal;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.moodtracker.ui.MoodlogActivity;

public class OuterRingMoods extends AppCompatActivity implements View.OnClickListener {

    private View topCard, bottomCard;
    private TextView topCardText, bottomCardText;
    private String submenuMood;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outer_ring_moods);
        /** This section makes variables for the the upper and lower sections of the
         * */

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

    void passMoodToOuterRingTop(int mood,  int color ){
        View card = findViewById(R.id.love_submenu_submenu_top_card);;
        card.setBackgroundColor(getResources().getColor(color));
        // Setting clickable
        card.setOnClickListener(this);

        TextView cardText = findViewById(R.id.love_submenu_submenu_top_text);
        cardText.setText(mood);

    }

    void passMoodToOuterRingBottom(int mood,  int color ){
        View card = findViewById(R.id.love_submenu_submenu_bottom_card);;
        card.setBackgroundColor(getResources().getColor(color));
        card.setOnClickListener(this);

        TextView cardText = findViewById(R.id.love_submenu_submenu_bottom_text);
        cardText.setText(mood);
    }



    /** This functions will change the text and colors of the file.
     * it will take string from the files of the second sub menu in the mood circle,
     * it will pass the string and with a switch the desired changes will be made.
     *
     * This files will changes the colors and names of the entire outer ring of the mood circle.
     * it will work for all the moods.
     * */
    private void moodChosen() {
        if (submenuMood != null) {
            switch (submenuMood) {

/**
 * This first section will make the changes pertaining to the moods in the LOVE submenu.
 * */
                case "peaceful":

                    passMoodToOuterRingTop(R.string.relieved, relived);
//
                    passMoodToOuterRingBottom(R.string.satisfied, satisfied);

                    break;

                case "tenderness":

                    passMoodToOuterRingTop(R.string.compassionate, compassionate);
//
                    passMoodToOuterRingBottom(R.string.caring, caring);

                    break;

                case "desire":
                    passMoodToOuterRingTop(R.string.infatuated, infatuation);
//
                    passMoodToOuterRingBottom(R.string.passion, passion);

                    break;

                case "longing":
                    passMoodToOuterRingTop(R.string.attracted, attracted);
//
                    passMoodToOuterRingBottom(R.string.sentimental, sentimental);

                    break;

                case "affectionate":
                    passMoodToOuterRingTop(R.string.fondness, fondness);
//
                    passMoodToOuterRingBottom(R.string.romantic, romantic);

                    break;
/**
 * This first section will make the changes pertaining to the moods in the JOY submenu.
 * */
                case "enthralled":
                    passMoodToOuterRingTop(R.string.raptured, rapture);
//
                    passMoodToOuterRingBottom(R.string.enchanted, enchanted);

                    break;

                case "elation":
                    passMoodToOuterRingTop(R.string.jubilation, jubilation);
//
                    passMoodToOuterRingBottom(R.string.euphoric, euphoric);

                    break;

                case "enthusiastic":
                    passMoodToOuterRingTop(R.string.zealous, zeal);
//
                    passMoodToOuterRingBottom(R.string.excited, exited);

                    break;

                case "optimistic":
                    passMoodToOuterRingTop(R.string.hopeful, hopeful);
//
                    passMoodToOuterRingBottom(R.string.eager, eager);

                    break;

                case "proud":
                    passMoodToOuterRingTop(R.string.illustrious, illustrious);
//
                    passMoodToOuterRingBottom(R.string.triumphant, triumphant);

                    break;

                case "cheerful":
                    passMoodToOuterRingTop(R.string.blissful, blissful);
//
                    passMoodToOuterRingBottom(R.string.jovial, jovial);

                    break;

                case "happy":
                    passMoodToOuterRingTop(R.string.delighted, delighted);
//
                    passMoodToOuterRingBottom(R.string.amused, amused);

                    break;

                case "content":
                    passMoodToOuterRingTop(R.string.satisfied, satisfied2);
//
                    passMoodToOuterRingBottom(R.string.pleased, pleased);

                    break;
/**
 * This first section will make the changes pertaining to the moods in the Surprise submenu.
 * */
                case "stunned":
                    passMoodToOuterRingTop(R.string.shocked, shocked);
//
                    passMoodToOuterRingBottom(R.string.dismayed, dismayed);

                    break;

                case "confused":
                    passMoodToOuterRingTop(R.string.disillusioned, disillusioned);
//
                    passMoodToOuterRingBottom(R.string.perplexed, perplexed);

                    break;

                case "amazed":
                    passMoodToOuterRingTop(R.string.astonished, astonished);
//
                    passMoodToOuterRingBottom(R.string.awe_struck, awe_struck);

                    break;

                case "overcome":
                    passMoodToOuterRingTop(R.string.speechless, speechless);
//
                    passMoodToOuterRingBottom(R.string.astounded, astounded);

                    break;

                case "moved":
                    passMoodToOuterRingTop(R.string.stimulated, stimulated);
//
                    passMoodToOuterRingBottom(R.string.touched, touched);

                    break;

                /**
                 * This first section will make the changes pertaining to the moods in the ANGER submenu.
                 * */
                case "disgust":
                    passMoodToOuterRingTop(R.string.revolt, revolt);
//
                    passMoodToOuterRingBottom(R.string.contempt, contempt);


                    break;
                case "envy":
                    passMoodToOuterRingTop(R.string.jealous, jealous);
//
                    passMoodToOuterRingBottom(R.string.resentful, resentful);

                    break;

                case "irritable":
                    passMoodToOuterRingTop(R.string.aggravated, Aggravated);
//
                    passMoodToOuterRingBottom(R.string.annoyed, annoyed);

                    break;

                case "exasperated":
                    passMoodToOuterRingTop(R.string.frustrated, frustrated);
//
                    passMoodToOuterRingBottom(R.string.agitated, agitated);

                    break;

                /**
                 * This first section will make the changes pertaining to the moods in the Sadness submenu.
                 * */
                case "despair":
                    passMoodToOuterRingTop(R.string.powerless, powerless);
//
                    passMoodToOuterRingBottom(R.string.grief, grief);


                    break;
                case "neglected":
                    passMoodToOuterRingTop(R.string.lonely, lonely);
//
                    passMoodToOuterRingBottom(R.string.isolated, isolated);


                    break;
                case "shameful":
                    passMoodToOuterRingTop(R.string.guilty, guilty);
//
                    passMoodToOuterRingBottom(R.string.regretful, regretful);


                    break;
                case "disappointment":
                    passMoodToOuterRingTop(R.string.displeased, displeased);
//
                    passMoodToOuterRingBottom(R.string.dismayed, dismayed2);


                    break;

                case "sadness":
                    passMoodToOuterRingTop(R.string.depressed, depressed);
//
                    passMoodToOuterRingBottom(R.string.hurt, hurt);


                    break;

                case "suffering":
                    passMoodToOuterRingTop(R.string.agony, Agony);
//
                    passMoodToOuterRingBottom(R.string.sorrow, sorrow);

                    break;

                /**
                 * This first section will make the changes pertaining to the moods in the Sadness submenu.
                 * */
                case "horror":

                    passMoodToOuterRingTop(R.string.dread, dread);
//
                    passMoodToOuterRingBottom(R.string.mortified, mortified);

                    break;

                case "nervous":
                    passMoodToOuterRingTop(R.string.anxious, anxious);
//
                    passMoodToOuterRingBottom(R.string.worried, worried);

                    break;

                case "insecure":
                    passMoodToOuterRingTop(R.string.inadequate, inadequate);
//
                    passMoodToOuterRingBottom(R.string.inferior, inferior);

                    break;

                case "terror":
                    passMoodToOuterRingTop(R.string.hysterical, hysterical);
//
                    passMoodToOuterRingBottom(R.string.panic, panic);

                    break;

                case "scared":
                    passMoodToOuterRingTop(R.string.helpless, helpless);
//
                    passMoodToOuterRingBottom(R.string.frightened, frightened);

                    break;
            }
        }
    }


    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.love_submenu_submenu_top_card:
                /** The value of the string and the value of the value of the color id will be copied
                 * from the the mood the user picks. The values will than be passed to the new activity that will be
                 * started. The values will attached to the new activity through the bundle().
                 *
                 * The values of bundle and be retrieved from bundle from the MoodlogActivity by
                 * using the bundle class. */
                Intent moodLog = new Intent(this, MoodlogActivity.class);

                // Retrieving value of the string of the mood from the TextView
                TextView mood = findViewById(R.id.love_submenu_submenu_top_text);
                String moodString = mood.getText().toString();
                Bundle moodText = new Bundle();
                moodText.putString("moodString", moodString);
                moodLog.putExtras(moodText);

                // retrieving background color
                View topSquareView = findViewById(R.id.love_submenu_submenu_top_card);
                int color = ((ColorDrawable) topSquareView.getBackground()).getColor();
                Bundle moodColor = new Bundle();
                moodColor.putInt("colorCode", color);
                moodLog.putExtras(moodColor);


                startActivity(moodLog);
                break;


            case R.id.love_submenu_submenu_bottom_card:

                /** The value of the string and the value of the value of the color id will be copied
                 * from the the mood the user picks. The values will than be passed to the new activity that will be
                 * started. The values will attached to the new activity through the bundle().
                 *
                 * The values of bundle and be retrieved from bundle from the MoodlogActivity by
                 * using the bundle class. */

                Intent moodLogBottom = new Intent(this, MoodlogActivity.class);

                // Retrieving value of the string of the mood from the TextView
                TextView moodBottom = findViewById(R.id.love_submenu_submenu_bottom_text);
                String moodStringBottom = moodBottom.getText().toString();
                Bundle moodTextBottom = new Bundle();
                moodTextBottom.putString("moodString", moodStringBottom);
                moodLogBottom.putExtras(moodTextBottom);

                // retrieving background color
                View topSquareViewBottom= findViewById(R.id.love_submenu_submenu_bottom_card);
                int colorBottom = ((ColorDrawable) topSquareViewBottom.getBackground()).getColor();
                Bundle moodColorBottom = new Bundle();
                moodColorBottom.putInt("colorCode", colorBottom);
                moodLogBottom.putExtras(moodColorBottom);


                startActivity(moodLogBottom);

                break;
        }
    }
}