package com.example.moodtracker.ui.moogLog;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.example.moodtracker.DatabaseHelper;

import androidx.constraintlayout.widget.ConstraintSet;

import com.example.moodtracker.R;
import com.example.moodtracker.ui.home.MainActivity;
import com.google.android.material.textfield.TextInputLayout;

import java.text.DateFormat;
import java.util.Date;

public class MoodlogActivity extends Activity implements View.OnClickListener {
    String currentMood ;
    int color;
    Button submit, cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mood_log);

        /** Setting Listeners */
        // Submit Button
        submit = findViewById(R.id.mood_log_submit);
        submit.setOnClickListener(this);
        // Cancel button
        cancel = findViewById(R.id.mood_log_cancel);
        cancel.setOnClickListener(this);



        // Pulling the values of ouf the bundle
        Bundle getInfo = getIntent().getExtras();
        currentMood = getInfo.getString("moodString");
        // Getting color for background
        color = getInfo.getInt("colorCode");


        // Calling functions to setup screen stuff
//        set_background_color(color);
        set_mood_on_screen(currentMood);
        set_date_and_time();

    }

    // Changes the name of the mood on the screen
    void set_mood_on_screen(String mood){
        TextView moodGoesHere = findViewById(R.id.mood_goes_here);
        moodGoesHere.setText(mood);
    }

    // Sets the time and date on the input log
    void set_date_and_time() {
        TextView clockGoesHere = findViewById(R.id.tvDateTime);
        String currentDateTimeString = DateFormat.getDateTimeInstance().format(new Date());
        clockGoesHere.setText(currentDateTimeString);
    }

    void set_background_color(int color){
        View parent = findViewById(R.id.mood_log_parent);
        parent.setBackgroundColor(getResources().getColor(color));
    }


    void submit_info(){
        EditText textFromMainTextfield = findViewById(R.id.mood_log_main_textfield);
        String str = textFromMainTextfield.getText().toString();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.mood_log_submit:
                submit_info();
                break;

                // Send you back to the main menu
            case R.id.mood_log_cancel:
                // Cartman's voice
                Intent imGoingHome = new Intent(this, MainActivity.class);
                startActivity(imGoingHome);
        }
    }
}
