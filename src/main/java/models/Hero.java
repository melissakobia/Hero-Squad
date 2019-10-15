package models;

import java.util.ArrayList;

public class Hero {
    private String name;
    private int age;
    private String specialPower;
    private String weakness;
    private static ArrayList<Hero> instances = new ArrayList<>();

    public Hero(String name, int age, String specialPower, String weakness) {
        this.name = name;
        this.age = age;
        this.specialPower = specialPower;
        this.weakness = weakness;
        instances.add(this);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSpecialPower() {
        return specialPower;
    }

    public String getWeakness() {
        return weakness;
    }

    public static ArrayList<Hero> getAll() {
        return instances;
    }

    public static void clearAllHeroes(){
        instances.clear();
    }
}
