package com.example.moodtracker.ui.wellnessToolbox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.moodtracker.R;
import com.example.moodtracker.ui.VideoView;

public class wellness_toolbox extends AppCompatActivity implements View.OnClickListener{

    View breathing;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wellness_toolbox);

// Each option on the menu needs to have a listener for clicking
        // Just copy and change variable name
        breathing = findViewById(R.id.imageButton_breathe);
        breathing.setOnClickListener(this);


    }

    /** The switch redirects to the same page
     *  The only difference will the paramter attached so that the new page knows the video
     *  to display.
     *
     *   ### Right now we only have one video which is a place holder*/
    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.imageButton_breathe:
                startActivity(new Intent(this, VideoView.class));
                break;
        }
    }
}