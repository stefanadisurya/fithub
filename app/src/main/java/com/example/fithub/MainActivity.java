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

    private TextView test;

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

//        test = findViewById(R.id.test);
//
//        Vector<Exercise> exerciseList =  new Vector<>();
//        exerciseList = db.getExerciseList();
//        if(!exerciseList.isEmpty()){
//            String txt = exerciseList.get(0).getName() +" " + exerciseList.get(0).getMinute() + " min: \n";
//            for(int i =0; i<exerciseList.get(0).getTypes().size();i++){
//                txt += exerciseList.get(0).getTypes().get(i).getName() + " " + exerciseList.get(0).getTypes().get(i).getReps() + "x \n";
//            }
//            test.setText(txt);

//        }else{
//            test.setText("NO DATA");
//        }

        exerciseList =  new Vector<>();
        exerciseList = db.getExerciseList();

        exerciseList.get(0).setImage(R.drawable.thumb4);
        exerciseList.get(1).setImage(R.drawable.thumb3);
        exerciseList.get(2).setImage(R.drawable.thumb2);
        exerciseList.get(3).setImage(R.drawable.thumb5);

        adapter = new ExerciseAdapter(this, exerciseList);
        rvExercises.setAdapter(adapter);
    }


}