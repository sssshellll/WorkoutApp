package com.example.myapplication.Activity;

import android.os.Bundle;
import android.view.WindowManager;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;


import com.example.myapplication.Adapter.WorkoutAdapter;
import com.example.myapplication.Domain.Lessions;
import com.example.myapplication.Domain.Workout;
import com.example.myapplication.R;
import com.example.myapplication.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        binding.view1.setLayoutManager(new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false));
        binding.view1.setAdapter(new WorkoutAdapter(getData()));

    }

    private ArrayList<Workout> getData() {
        ArrayList<Workout> list = new ArrayList<>();

        list.add(new Workout("Running", "Excellent running lesson for you!", "pic_1", 160, "9 min", getLessons_1()));
        list.add(new Workout("Scretching", "Excellent scretching lesson for you!", "pic_2", 230, "85 min", getLession_2()));
        list.add(new Workout("Yoga", "Excellent yoga lesson for you!", "pic_3", 180, "65 min", getLession_3()));

        return list;
    }

    private ArrayList<Lessions> getLessons_1 () {
        ArrayList<Lessions> list = new ArrayList<>();

        list.add(new Lessions("Lesson 1", "03:46", "HBPMvFkpNgE", "pic_1_1"));
        list.add(new Lessions("Lesson 2", "03:41", "K6I24WgiiPw", "pic_1_2"));
        list.add(new Lessions("Lesson 3", "01:57", "Zc08v4YYOeA", "pic_1_3"));

        return list;
    }

    private ArrayList<Lessions> getLession_2() {
        ArrayList<Lessions> list = new ArrayList<>();

        list.add(new Lessions("Lesson 1", "20:23", "L3eImBAXY7I", "pic_3_1"));
        list.add(new Lessions("Lesson 2", "18:27", "47ExgzO7FlU", "pic_3_2"));
        list.add(new Lessions("Lesson 3", "32:25", "OmLx8tmaQ-4", "pic_3_3"));
        list.add(new Lessions("Lesson 4", "07:52", "w86EalEoFRY", "pic_3_4"));

        return list;
    }

    private ArrayList<Lessions> getLession_3() {
        ArrayList<Lessions> list = new ArrayList<>();

        list.add(new Lessions("Lesson 1", "23:00", "v7AYKM6rOE", "pic_3_1"));
        list.add(new Lessions("Lesson 2", "27:00", "Eml2xnoLpYE", "pic_3_2"));
        list.add(new Lessions("Lesson 3", "25:00", "v7SN-d4qXx0", "pic_3_3"));
        list.add(new Lessions("Lesson 4", "21:00", "LqXZ628YNj4", "pic_3_4"));

        return list;
    }



}