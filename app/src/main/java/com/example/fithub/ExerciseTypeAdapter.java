package com.example.fithub;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Vector;

public class ExerciseTypeAdapter extends RecyclerView.Adapter<ExerciseTypeAdapter.ViewHolder> {
    Context ctx;
    Vector<Type> listType;
    public ExerciseTypeAdapter(Context ctx, Vector<Type> list){
        this.ctx = ctx;
        this.listType = list;
    }
    @NonNull
    @Override
    public ExerciseTypeAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(ctx).inflate(R.layout.exercisetype_rows, parent, false);
        return new ExerciseTypeAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ExerciseTypeAdapter.ViewHolder holder, int position) {
        Type type =  listType.get(position);
        holder.type_name.setText(type.getName());
        holder.type_rep.setText(" x"+String.valueOf(type.getReps()));
        holder.type_img.setImageResource(type.getImg());

    }

    @Override
    public int getItemCount() {
        return listType.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView type_img;
        TextView type_name, type_rep;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            type_img = itemView.findViewById(R.id.type_img);
            type_rep = itemView.findViewById(R.id.type_rep);
            type_name = itemView.findViewById(R.id.type_name);
        }
    }
}
