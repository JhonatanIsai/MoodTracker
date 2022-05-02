package com.example.moodtracker.ui.moogLog;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.moodtracker.R;

import java.text.DateFormat;
import java.util.Date;

public class MoodlogActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mood_log);

        // this part is for the date&time used in the moodLog page -Kenzie
        onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tvDateTime = findViewById(R.id.tvDateTime);
        String currentDateTimeString = DateFormat.getDateTimeInstance().format(new Date());
        tvDateTime.setText(currentDateTimeString);
    }
}
