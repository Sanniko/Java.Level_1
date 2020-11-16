package ru.geekbrains;

public class Cat extends Animal{

    public Cat(String animalName)
    {
        super(animalName, 200, 0, 2);
    }

    public Cat(String animalName,float LimitLengthRun, float LimitHeightJump){

        super(animalName, LimitLengthRun, 0, LimitHeightJump);
    }

    @Override
    public boolean Swim(float length) {
        System.out.printf("Cat(%s)->Swim(%.1f)->result: false. Cats can't swim!\n",this.animalName,length );
        return false;
    }

    @Override
    protected String GetAnimalType() {
        return "Cat";
    }
}
