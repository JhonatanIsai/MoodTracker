/** ************************************************************************
 * For questions about code and other stuff regarding this file ask Jhonatan
 * *************************************************************************
 *  */

package com.example.moodtracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintSet;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private View colorSquares, wellnessToolbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colorSquares = findViewById(R.id.moodSquare_parent);
        colorSquares.setOnClickListener(this);

        wellnessToolbox = findViewById(R.id.main_menu_wellness_TB);
        wellnessToolbox.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.moodSquare_parent:
                startActivity(new Intent(this, MoodSquaresActivity.class));
                break;

            case R.id.main_menu_wellness_TB:
                startActivity(new Intent(this, wellness_toolbox.class));
                break;
        }

    }
}