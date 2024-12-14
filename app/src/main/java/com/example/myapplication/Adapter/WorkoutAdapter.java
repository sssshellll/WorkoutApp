package com.example.myapplication.Adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bumptech.glide.Glide;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.Activity.Workout_Activity;
import com.example.myapplication.Domain.Workout;
import com.example.myapplication.databinding.VeiwholderWorkoutBinding;

import java.util.ArrayList;

public class WorkoutAdapter extends RecyclerView.Adapter<WorkoutAdapter.Viewholder> {
    private final ArrayList<Workout> list;
    private Context context;


    public WorkoutAdapter(ArrayList<Workout> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public WorkoutAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context=parent.getContext();
        VeiwholderWorkoutBinding binding=VeiwholderWorkoutBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new Viewholder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull WorkoutAdapter.Viewholder holder, int position) {
        holder.binding.titleTxt.setText(list.get(position).getTitle());
        int resID=context.getResources().getIdentifier(list.get(position).getPicPath(), "drawable", context.getPackageName());



        Glide.with(holder.itemView.getContext())
                .load(resID)
                .into(holder.binding.pic);
        holder.binding.exerciseTxt.setText(list.get(position).getLessions().size()+" Exercise");
        holder.binding.kcalTxt.setText(list.get(position).getKcal()+" Kcal");
        holder.binding.durationTxt.setText(list.get(position).getDurationAll());

        holder.binding.getRoot().setOnClickListener(v -> {
            Intent intent=new Intent(context, Workout_Activity.class);
            intent.putExtra("object",list.get(position));
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder{
        VeiwholderWorkoutBinding binding;
        public Viewholder(VeiwholderWorkoutBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }


}
