package com.example.moodtracker.ui.moogLog;

import android.app.Activity;
import android.os.Bundle;

import com.example.moodtracker.R;

public class MoodlogActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mood_log);

        addMood();//pass the mood into this function; where to find it? - Kenzie

    }

    private void addMood() {//putting this here. not sure how to implement, sorry! - Kenzie
    }

}
