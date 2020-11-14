package ru.geekbrains;

public class Main {

    public static void main(String[] args) {
        Employee Employee1 = new Employee("Дадон Салтаныч Красивый","царь", "dadon@ya.ru", "111-11-11", 1000000, 50);
        Employee1.printEmployee();

        Employee[] emplArray = new Employee[5];
        emplArray[0] = new Employee("Ярослава Васильевна Мудрая", "царица", "mudraya@ya.ru", "222-22-22", 700000, 45);
        emplArray[1] = new Employee("Гвидон Дадоныч Сильный", "царевич", "guidon@ya.ru", "333-33-33", 500000, 25);
        emplArray[2] = new Employee("Забава Дадоновна Краснощёкая", "царевна", "zabava@ya.ru", "444-44-44", 500000, 20);
        emplArray[3] = new Employee("Марфа Дадоновна Крепкозубая", "царевна", "marfa@ya.ru", "555-55-55", 500000, 18);
        emplArray[4] = new Employee("Добрыня Дадоныч Голопятый", "царевич", "dobrinya@ya.ru", "666-66-66", 0, 5);

        for (int i = 0; i < emplArray.length; i++){
            if (emplArray[i].age >= 40)
            emplArray[i].printEmployee();
        }

    }

}
