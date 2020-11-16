package ru.geekbrains;

public class Main {

    public static void main(String[] args) {

        Animal[] animals = new Animal[5];

        animals[0] = new Cat("Васька",100, 1);
        animals[1] = new Dog("Тузик",5000, 1, 50f);
        animals[2] = new Cat("Мурка");
        animals[3] = new Dog("Дружок");
        animals[4] = new Dog("Мухтар",10, 100, 5f);

        for (int i =0; i < animals.length; i++){
            animals[i].Jump(1);
        }

        System.out.println();

        for (int i =0; i < animals.length; i++){
            animals[i].Swim(15);
        }

        System.out.println();

        for (int i =0; i < animals.length; i++){
            animals[i].Run(150);
        }
    }
}
