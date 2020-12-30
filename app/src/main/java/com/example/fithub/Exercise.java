package com.example.fithub;

import java.util.Vector;

public class Exercise {
    private String name;
    private int minute;
    private Vector<Type> types;
//    private Type types;
//    public Exercise(String name, int minute, Type types) {
//        this.name = name;
//        this.minute = minute;
//        this.types = types;
//    }
    public Exercise(String name, int minute, Vector<Type> types) {
        this.name = name;
        this.minute = minute;
        this.types = types;
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

    public void setTypes(Vector<Type> types) {
        this.types = types;
    }

//    public Type getTypes() {
//        return types;
//    }
//
//    public void setTypes(Type types) {
//        this.types = types;
//    }
}
