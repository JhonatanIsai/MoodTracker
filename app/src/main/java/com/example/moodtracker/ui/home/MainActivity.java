/** ************************************************************************
 * For questions about code and other stuff regarding this file ask Jhonatan
 * *************************************************************************
 *  */

package com.example.moodtracker.ui.home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.text.DateFormat;
import java.util.Date;

import com.example.moodtracker.HistoricalDataActivity;
import com.example.moodtracker.R;
import com.example.moodtracker.ui.MoodSquaresActivity;
import com.example.moodtracker.ui.wellnessToolbox.wellness_toolbox;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private View colorSquares, wellnessToolbox, historicalData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colorSquares = findViewById(R.id.moodSquare_parent);
        colorSquares.setOnClickListener(this);

        wellnessToolbox = findViewById(R.id.main_menu_wellness_TB);
        wellnessToolbox.setOnClickListener(this);

        historicalData = findViewById(R.id.historical_data_parent);
        historicalData.setOnClickListener(this);



    }

//    This is for the menu that has the mood squres and the other pages(Main Menu)
    @Override
    public void onClick(View view) {
//        Still Need to the add the rest of the page


        /** Just the links to the other pages
         *
         *  ### Mood Squares : Done
         *  ### Wellness Toolbox : Done
         *  ### Mood logs: Pending
         *  ### Charts : Pending
         *
         *  */


        // Here ya'll can just copy the parameter for the cases bellow and change the activity name
        switch (view.getId()){
            case R.id.moodSquare_parent:
                startActivity(new Intent(this, MoodSquaresActivity.class));
                break;

            case R.id.main_menu_wellness_TB:
                startActivity(new Intent(this, wellness_toolbox.class));
                break;

            case R.id.historical_data_parent:
                startActivity(new Intent(this, HistoricalDataActivity.class));
                break;

                // Two other options bellow
        }

    }
}
