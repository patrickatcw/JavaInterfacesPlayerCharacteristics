package com.me;

import java.util.ArrayList;
import java.util.List;

//step 3 created Player class
public class Player implements ISaveable{

    //step 4 fields
    private String name;
    private int hitPoints;
    private int strength;
    private String weapon;

    //step 5 create constructor
    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        //step 6 hardcode weapon
        this.weapon = "Sword";

    }

    //step 7 getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitpoints() {
        return hitPoints;
    }

    public void setHitpoints(int hitpoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    //step 8 override to string
    @Override
    public String toString() {
        return "Player{" +
                "name = '" + name + '\'' +
                ", hitPoints = " + hitPoints +
                ", strength = " + strength +
                ", weapon = '" + weapon + '\'' +
                '}';
    }

    //step 9 implement methods
    @Override
    public List<String> write() {
        //step 10 create an arraylist
        List<String> values = new ArrayList<String>();

        //step 11 add values
        values.add(0, this.name);
        values.add(1, "" + this.hitPoints);
        values.add(2, "" + this.strength);
        values.add(3, this.weapon);

        return values;
    }

    @Override
    public void read(List<String> savedValues) {

        //step 12
        if(savedValues != null && savedValues.size() > 0){
            this.name = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
            this.weapon = savedValues.get(3);

            //step 13 go back to main class

        }
    }
}
