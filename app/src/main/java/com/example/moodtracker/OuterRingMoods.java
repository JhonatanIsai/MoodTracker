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

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class OuterRingMoods extends AppCompatActivity {

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
/**
 * This first section will make the changes pertaining to the moods in the Surprise submenu.
 * */
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


                /**
                 * This first section will make the changes pertaining to the moods in the ANGER submenu.
                 * */
                case "disgust":
                    topCard.setBackgroundColor(getResources().getColor(revolt));
                    topCardText.setText(R.string.revolt);

                    bottomCard.setBackgroundColor(getResources().getColor(contempt));
                    bottomCardText.setText(R.string.contempt);
                    break;
                case "envy":
                    topCard.setBackgroundColor(getResources().getColor(jealous));
                    topCardText.setText(R.string.jealous);

                    bottomCard.setBackgroundColor(getResources().getColor(resentful));
                    bottomCardText.setText(R.string.resentful);
                    break;
                case "irritable":
                    topCard.setBackgroundColor(getResources().getColor(Aggravated));
                    topCardText.setText(R.string.Aggravated);

                    bottomCard.setBackgroundColor(getResources().getColor(annoyed));
                    bottomCardText.setText(R.string.annoyed);
                    break;
                case "exasperated":
                    topCard.setBackgroundColor(getResources().getColor(frustrated));
                    topCardText.setText(R.string.frustrated);

                    bottomCard.setBackgroundColor(getResources().getColor(agitated));
                    bottomCardText.setText(R.string.agitated);
                    break;


                /**
                 * This first section will make the changes pertaining to the moods in the Sadness submenu.
                 * */
                case "despair":
                    topCard.setBackgroundColor(getResources().getColor(powerless));
                    topCardText.setText(R.string.powerless);

                    bottomCard.setBackgroundColor(getResources().getColor(grief));
                    bottomCardText.setText(R.string.grief);
                    break;
                case "neglected":
                    topCard.setBackgroundColor(getResources().getColor(lonely));
                    topCardText.setText(R.string.lonely);

                    bottomCard.setBackgroundColor(getResources().getColor(isolated));
                    bottomCardText.setText(R.string.isolated);
                    break;
                case "shameful":
                    topCard.setBackgroundColor(getResources().getColor(guilty));
                    topCardText.setText(R.string.guilty);

                    bottomCard.setBackgroundColor(getResources().getColor(regretful));
                    bottomCardText.setText(R.string.regretful);
                    break;
                case "disappointment":
                    topCard.setBackgroundColor(getResources().getColor(displeased));
                    topCardText.setText(R.string.displeased);

                    bottomCard.setBackgroundColor(getResources().getColor(dismayed2));
                    bottomCardText.setText(R.string.dismayed);

                    break;

                case "sadness":
                    topCard.setBackgroundColor(getResources().getColor(depressed));
                    topCardText.setText(R.string.depressed);

                    bottomCard.setBackgroundColor(getResources().getColor(hurt));
                    bottomCardText.setText(R.string.hurt);
                    break;

                case "suffering":
                    topCard.setBackgroundColor(getResources().getColor(Agony));
                    topCardText.setText(R.string.Agony);

                    bottomCard.setBackgroundColor(getResources().getColor(sorrow));
                    bottomCardText.setText(R.string.sorrow);
                    break;



                /**
                 * This first section will make the changes pertaining to the moods in the Sadness submenu.
                 * */
                case "horror":
                    topCard.setBackgroundColor(getResources().getColor(dread));
                    topCardText.setText(R.string.dread);

                    bottomCard.setBackgroundColor(getResources().getColor(mortified));
                    bottomCardText.setText(R.string.mortified);
                    break;
                case "nervous":
                    topCard.setBackgroundColor(getResources().getColor(anxious));
                    topCardText.setText(R.string.anxious);

                    bottomCard.setBackgroundColor(getResources().getColor(worried));
                    bottomCardText.setText(R.string.worried);
                    break;
                case "insecure":
                    topCard.setBackgroundColor(getResources().getColor(inadequate));
                    topCardText.setText(R.string.inadequate);

                    bottomCard.setBackgroundColor(getResources().getColor(inferior));
                    bottomCardText.setText(R.string.inferior);
                    break;
                case "terror":
                    topCard.setBackgroundColor(getResources().getColor(hysterical));
                    topCardText.setText(R.string.hysterical);

                    bottomCard.setBackgroundColor(getResources().getColor(panic));
                    bottomCardText.setText(R.string.panic);

                    break;

                case "scared":
                    topCard.setBackgroundColor(getResources().getColor(helpless));
                    topCardText.setText(R.string.helpless);

                    bottomCard.setBackgroundColor(getResources().getColor(frightened));
                    bottomCardText.setText(R.string.frightened);
                    break;


            }


        }

    }


}