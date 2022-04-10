package com.example.moodtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class HistoricalDataBarGraphActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historical_data_bar_graph);

        BarChart barChart = findViewById(R.id.barGraph);

        ArrayList<BarEntry> Mood = new ArrayList<>();
        Mood.add(new BarEntry(1, 20));
        Mood.add(new BarEntry(2, 30));
        Mood.add(new BarEntry(3, 40));
        Mood.add(new BarEntry(4, 50));
        Mood.add(new BarEntry(5, 60));
        Mood.add(new BarEntry(6, 70));
        Mood.add(new BarEntry(7, 80));
        Mood.add(new BarEntry(8, 90));

        BarDataSet barDataSet = new BarDataSet(Mood, "Visitors");
        barDataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        barDataSet.setValueTextColor(Color.BLACK);
        barDataSet.setValueTextSize(22f);

        BarData barData = new BarData(barDataSet);

        barChart.setFitBars(true);
        barChart.setData(barData);
        barChart.getDescription().setText("Placeholder Bar Graph");
        barChart.animateY(2000);


    }
}