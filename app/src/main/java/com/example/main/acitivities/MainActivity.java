package com.example.main.acitivities;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.main.R;
import com.github.romanqed.ScheduleLoader;

import java.util.Map;
import java.util.concurrent.ExecutionException;

import biweekly.ICalendar;

public class MainActivity extends AppCompatActivity {

    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        try {
//            Map<String, String> a = ScheduleLoader.loadSchedules().async().get();
//            //Toast.makeText(this, Integer.toString(a.size()), Toast.LENGTH_LONG).show();
//            ICalendar timeTable =  ScheduleLoader.loadSchedule(a.get("иу7-15б")).async().get();
//
//            Log.d("ASD", timeTable.getEvents().toString());
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}