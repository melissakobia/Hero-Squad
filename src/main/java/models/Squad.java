package models;

public class Squad {
    private String name;
    private String cause;
    private int maxSize;

    public Squad(String name, String cause, int maxSize) {
        this.name = name;
        this.cause = cause;
        this.maxSize = maxSize;

    }

    public String getName() {
        return name;
    }

    public String getCause() {
        return cause;
    }

    public int getMaxSize() {
        return maxSize;
    }
}
