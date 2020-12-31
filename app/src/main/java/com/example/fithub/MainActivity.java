package com.example.fithub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Vector;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvExercises;
    ExerciseAdapter adapter;
    Vector<Exercise> exerciseList;

    DatabaseHelper db = new DatabaseHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvExercises = findViewById(R.id.rvExercises);
        rvExercises.setLayoutManager(new LinearLayoutManager(this));
        rvExercises.setFocusable(false);

        findViewById(R.id.linear).requestFocus();

        exerciseList =  new Vector<>();
        exerciseList = db.getExerciseList();

        adapter = new ExerciseAdapter(this, exerciseList);
        rvExercises.setAdapter(adapter);
    }

}