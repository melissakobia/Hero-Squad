package models;

import java.util.ArrayList;

public class Squad {
    private String squadName;
    private String cause;
    private int maxSize;
    private static ArrayList<Squad> instances = new ArrayList<>();

    public Squad(String squadName, String cause, int maxSize) {
        this.squadName = squadName;
        this.cause = cause;
        this.maxSize = maxSize;
        instances.add(this);

    }

    public String getsquadName() {
        return squadName;
    }

    public String getCause() {
        return cause;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public static ArrayList<Squad> getAll() {
        return instances;
    }

    public static void clearAllSquads(){
        instances.clear();
    }
}
