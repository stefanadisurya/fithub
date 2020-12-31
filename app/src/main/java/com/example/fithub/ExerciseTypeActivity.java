package com.example.fithub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Vector;

public class ExerciseTypeActivity extends AppCompatActivity {
    Vector<Type> exercisetype;
    TextView title, total_min;
    int exec_id, exec_min;
    String exec_name;
    RecyclerView rvTypes;
    ExerciseTypeAdapter adapter;
    ImageView backBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_type);

        rvTypes = findViewById(R.id.rvTypes);
        rvTypes.setLayoutManager(new LinearLayoutManager(this));
        rvTypes.setFocusable(false);
        backBtn = findViewById(R.id.backBtn);

        getData();
        setData();

        adapter = new ExerciseTypeAdapter(this, exercisetype);
        rvTypes.setAdapter(adapter);

    }
    public void backClick(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    private void getData(){

        exercisetype = new Vector<>();
        if(getIntent().hasExtra("exec_id")){
            exec_id = getIntent().getIntExtra("exec_id", 1);
            exec_name  = getIntent().getStringExtra("exec_name");
            exec_min= getIntent().getIntExtra("exec_min", 1);

            DatabaseHelper dh = new DatabaseHelper(this);
            exercisetype = dh.getTypeList(exec_id);
        }
    }
    private void setData(){
        title = findViewById(R.id.type_title);
        total_min = findViewById(R.id.type_min);

        title.setText(exec_name);
        total_min.setText(String.valueOf(exec_min) + " mins.");
    }
}