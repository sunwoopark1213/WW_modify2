package com.example.newww;

import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

public class CalendarActivity extends AppCompatActivity {

    private GridView calendarGridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        calendarGridView = findViewById(R.id.calendarGridView);

        int[] weatherIcons = new int[365]; // Array to hold weather icons for each day of 2024
        // Dummy data for demonstration purposes
        for (int i = 0; i < weatherIcons.length; i++) {
            if (i % 4 == 0) {
                weatherIcons[i] = R.drawable.sunny;
            } else if (i % 4 == 1) {
                weatherIcons[i] = R.drawable.cloudy;
            } else if (i % 4 == 2) {
                weatherIcons[i] = R.drawable.rainy;
            } else {
                weatherIcons[i] = R.drawable.snowy;
            }
        }

        CalendarAdapter adapter = new CalendarAdapter(this, weatherIcons);
        calendarGridView.setAdapter(adapter);
    }
}
