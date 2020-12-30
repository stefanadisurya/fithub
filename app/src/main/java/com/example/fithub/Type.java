package com.example.fithub;

public class Type {
    private String name;
    private String description;
    private int reps;

    public Type(String name, String description, int reps) {
        this.name = name;
        this.description = description;
        this.reps = reps;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }
}
