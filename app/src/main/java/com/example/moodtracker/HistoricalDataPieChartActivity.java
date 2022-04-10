package com.example.moodtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class HistoricalDataPieChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historical_data_pie_chart);

        PieChart pieChart = findViewById(R.id.pieChart);

        ArrayList<PieEntry> Mood = new ArrayList<>();
        Mood.add(new PieEntry(3, "Happy"));
        Mood.add(new PieEntry(2, "Sad"));
        Mood.add(new PieEntry(3, "Angry"));
        Mood.add(new PieEntry(4, "Really Happy"));
        Mood.add(new PieEntry(5, "Really Angry"));
        Mood.add(new PieEntry(6, "Really Sad"));
        Mood.add(new PieEntry(7, "Eh"));

        PieDataSet pieDataSet = new PieDataSet(Mood, "Mood");
        pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet.setValueTextColor(Color.BLACK);
        pieDataSet.setValueTextSize(18f);

        PieData pieData = new PieData(pieDataSet);

        pieChart.setData(pieData);
        pieChart.getDescription().setEnabled(false);
        pieChart.setCenterText("Mood");
        pieChart.animate();
    }
}