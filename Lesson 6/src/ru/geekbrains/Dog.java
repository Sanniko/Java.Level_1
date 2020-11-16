package ru.geekbrains;

public class Dog extends Animal {

    public Dog(String animalName) {

        super(animalName, 500, 10, 0.5f);
    }

    public Dog(String animalName, float LimitLengthRun, float LimitLengthSwim, float LimitHeightJump) {

        super(animalName, LimitLengthRun, LimitLengthSwim, LimitHeightJump);

    }

    @Override
    protected String GetAnimalType() {
        return "Dog";
    }
}