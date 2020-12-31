package com.example.fithub;

import java.util.Vector;

public class Exercise {
    private String name;
    private int minute;
    private String description;
    private Vector<Type> types;
    private int image;

//    private Type types;
//    public Exercise(String name, int minute, Type types) {
//        this.name = name;
//        this.minute = minute;
//        this.types = types;
//    }
    public Exercise(String name, int minute, String description, Vector<Type> types, int image) {
        this.name = name;
        this.minute = minute;
        this.description = description;
        this.types = types;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public Vector<Type> getTypes() {
        return types;
    }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public void setTypes(Vector<Type> types) {
        this.types = types;
    }

    public int getImage() { return image; }

    public void setImage(int image) { this.image = image; }

//    public Type getTypes() {
//        return types;
//    }
//
//    public void setTypes(Type types) {
//        this.types = types;
//    }
}
