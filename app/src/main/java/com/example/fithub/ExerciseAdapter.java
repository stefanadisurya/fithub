package com.example.fithub;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Vector;

public class ExerciseAdapter extends RecyclerView.Adapter<ExerciseAdapter.ViewHolder> {

    Context ctx;
    Vector<Exercise> exerciseList;

    public ExerciseAdapter(Context ctx, Vector<Exercise> exerciseList) {
        this.ctx = ctx;
        this.exerciseList = exerciseList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(ctx).inflate(R.layout.exercise_rows, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Exercise exercise = exerciseList.get(position);

        holder.tvName.setText(exercise.getName());
        holder.tvDesc.setText(exercise.getDescription());
        holder.ivThumbnail.setImageResource(exercise.getImage());
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ctx, ExerciseTypeActivity.class);
                intent.putExtra("exec_id", exercise.getId());
                intent.putExtra("exec_name", exercise.getName());
                intent.putExtra("exec_min", exercise.getMinute());
                ctx.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return exerciseList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView ivThumbnail;
        TextView tvName;
        TextView tvDesc;

        LinearLayout linearLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            ivThumbnail = itemView.findViewById(R.id.ivThumbnail);
            tvName = itemView.findViewById(R.id.tvName);
            tvDesc = itemView.findViewById(R.id.tvDesc);

            linearLayout = itemView.findViewById(R.id.mainLayout);
        }
    }
}
