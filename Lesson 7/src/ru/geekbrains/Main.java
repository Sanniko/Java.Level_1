package ru.geekbrains;

import java.lang.reflect.Array;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Plate plate = new Plate(15);

        Cat[] catsArr = CreateCats(4);
        System.out.println(catsArr.length);
        CatsInfo(catsArr);
        plate.info();
        CatsEat(catsArr, plate);
        CatsInfo(catsArr);
        plate.info();
        plate.addFood(100);
        plate.info();

    }
    public static Cat[] CreateCats (int b){
        Cat[] cats;
        if (b > 0){
            Random rand = new Random();
            cats =  new Cat[b];
            for (int i = 0; i < b; i++){
                cats[i] = new Cat("Cat №"+(i+1), (1+rand.nextInt(4))*5);
            }
        } else{
            cats =  new Cat[0];
        }
        return cats;
    }
    public static void CatsInfo(Cat[] cats){
        if(cats != null)
        {
            for (int i = 0; i< cats.length;i++){
                cats[i].catInfo();
            }
        }
    }
    public static void CatsEat(Cat[] cats, Plate a){
        if(cats != null)
        {
            for (int i = 0; i< cats.length;i++){
                cats[i].eat(a);
            }
        }
    }

}
