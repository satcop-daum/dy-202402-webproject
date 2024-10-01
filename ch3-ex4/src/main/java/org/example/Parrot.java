package org.example;

public class Parrot {

    private String name;

    public Parrot() {
        System.out.println("Parrot이 생성됨.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Parrot [name=" + name + "]";
    }

}
