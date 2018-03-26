package com.me;

import java.util.ArrayList;
import java.util.List;

//step 18 monster class
public class Monster implements ISaveable{

    //step 19 fields
    private String name;
    private int hitPoints;
    private int strength;

    //step 20 constructor
    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;

    }

    //step 21 getters
    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;

    }

    //step 23 override methods
    @Override
    public List<String> write() {
        ArrayList<String> values = new ArrayList<String>();
        values.add(0, this.name);
        values.add(1, "" + this.hitPoints);
        values.add(2, "" + this.strength);
        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if(savedValues != null && savedValues.size()> 0){
            this.name = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));

            //step 24 go back to main

        }
    }

    //step 22 override to string
    @Override
    public String toString() {
        return "Monster{" +
                "name = '" + name + '\'' +
                ", hitPoints = " + hitPoints +
                ", strength = " + strength +
                '}';

    }

}
