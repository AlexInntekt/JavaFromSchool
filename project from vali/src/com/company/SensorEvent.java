package com.company;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Calendar;

/**
 *
 * @author Valentin
 */
public class SensorEvent {
    public enum Type {
        FIRE, SMOKE, INTRUSION;
    }
    private Type type;
    private Calendar time;
    private int id;

    public SensorEvent(Type type, Calendar time, int id) {
        this.type = type;
        this.time = time;
        this.id = id;
    }

    @Override
    public String toString() {
        return "SensorEvent{" + "type=" + type + ", time=" + time.getTime() + ", id=" + id + '}';
    }

}
