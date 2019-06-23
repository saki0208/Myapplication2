package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
public class DisplayMessageActivity extends AppCompatActivity {
     BarChart barChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        if ((message).equals("0000")) {
            // Capture the layout's TextView and set the string as its text

            barChart = findViewById(R.id.mp_BarChart);
            BarDataSet barDataSet1 = new BarDataSet(dataValuesl(), "DataSet 1");
            BarData barData =new BarData();
            barData.addDataSet(barDataSet1);
            barChart.setData(barData);
            barChart.invalidate();



        } else {

        }
    }
        private ArrayList<BarEntry> dataValuesl(){
            ArrayList<BarEntry> dataVals =new ArrayList<>();
            dataVals.add(new BarEntry(0,3));
            dataVals.add(new BarEntry(1,4));
            dataVals.add(new BarEntry(3,6));
            dataVals.add(new BarEntry(2,7));
            dataVals.add(new BarEntry(4,11));
            return dataVals;
        }




    }






