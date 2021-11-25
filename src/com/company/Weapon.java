package com.company;

public class Weapon {
    private String name;
    private String Type;

    public Weapon(String name, String type) {
        this.name = name;
        Type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTybe() {
        return Type;
    }

    public void setType(String tybe) {
        Type = tybe;
    }
}
