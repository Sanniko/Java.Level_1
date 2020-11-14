package ru.geekbrains;

public class Employee {

    String fullName;
    String function;
    String email;
    String phone;
    double salary;
    int age;

    Employee (String fullName, String function, String email, String phone, double salary, int age){
        this.fullName = fullName;
        this.function = function;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    void printEmployee() {
        System.out.println("Сотрудник:\n" + fullName + ",\n" + function + ",\n" + email + ",\n"
                            + phone + ",\n" + salary + ",\n" + age + " лет.\n");
    }

}
