package com.example.moodtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HistoricalDataActivity extends AppCompatActivity implements View.OnClickListener {
    private View barGraph, pieChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historical_data);


        barGraph = findViewById(R.id.Button_barGraph);
        barGraph.setOnClickListener(this);

        pieChart = findViewById(R.id.Button_pieChart);
        pieChart.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.Button_barGraph:
                startActivity(new Intent(this, HistoricalDataBarGraphActivity.class));
                break;
            case R.id.Button_pieChart:
                startActivity(new Intent(this, HistoricalDataPieChartActivity.class));
                break;
        }

    }
}