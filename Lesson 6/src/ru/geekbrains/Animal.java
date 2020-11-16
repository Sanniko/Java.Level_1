package ru.geekbrains;

public abstract class Animal {

    protected float LimitLengthRun;
    protected float LimitLengthSwim;
    protected float LimitHeightJump;
    protected String animalName;

    protected Animal (String animalName, float lengthRun, float lengthSwim, float heightJump){
        this.LimitLengthRun = lengthRun;
        this.LimitLengthSwim = lengthSwim;
        this.LimitHeightJump = heightJump;
        this.animalName = animalName;
    }

    protected String GetAnimalType(){
        return "Unknown";
    }

    protected boolean Act (String actionName, float limit, float actionValue){
        Boolean res = actionValue < limit;
        System.out.printf("%s(%s)->%s(%.1f)->result: %b.\n",GetAnimalType(), animalName, actionName, actionValue, res );
        return res;
    }

    public boolean Jump (float height) {
        return Act("Jump", LimitHeightJump, height);
    }

    public boolean Swim (float length){
        return Act("Swim", LimitLengthSwim, length);
    }

    public boolean Run(float length){
        return Act("Run", LimitLengthRun, length);
    }

}



