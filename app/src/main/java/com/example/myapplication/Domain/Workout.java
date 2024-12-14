package com.example.myapplication.Domain;

import java.io.Serializable;
import java.util.ArrayList;

public class Workout implements Serializable {
    private String title;
    private String description;
    private String picPath;
    private int kcal;
    private String durationAll;
    private ArrayList<Lessions> lessions;

    public Workout(String title, String description, String picPath, int kcal, String durationAll, ArrayList<Lessions> lessions) {

        this.title = title;
        this.description = description;
        this.picPath = picPath;
        this.kcal = kcal;
        this.durationAll = durationAll;
        this.lessions = lessions;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public int getKcal() {
        return kcal;
    }

    public void setKcal(int kcal) {
        this.kcal = kcal;
    }

    public ArrayList<Lessions> getLessions() {
        return lessions;
    }

    public void setLessions(ArrayList<Lessions> lessions) {
        this.lessions = lessions;
    }

    public String getDurationAll() {
        return durationAll;
    }

    public void setDurationAll(String durationAll) {
        this.durationAll = durationAll;
    }
}
