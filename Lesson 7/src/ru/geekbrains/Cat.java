package ru.geekbrains;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat (String name, int appetite){
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat (Plate a){
        System.out.println(name + " eating... ");
        satiety = a.decreaseFood (appetite);
        if (satiety){
            System.out.println(name + " is happy now!");
        } else {
            System.out.println(name + " is still hungry!");
        }
    }

    public void catInfo (){
        System.out.println(name + " [appetite: " + appetite + ", satiety: " + satiety+"]");
    }
}
