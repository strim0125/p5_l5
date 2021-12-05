package ru.geekbrains.common.part2_lesson4;

public class Main {

    public static void main(String[] args) {
        Employe[] employees = new Employe[5];
        employees[0] = new Employe("Ivanov Ivan", "developer", "ivanov@emplyees.ru", 2421917, 23000, 21);
        employees[1] = new Employe("Petrov Andrey", "stroitel", "petrov@emplyees.ru", 2421920, 26000, 31);
        employees[2] = new Employe("Sidorov Vasiliy", "dev", "sidirov@emplyees.ru", 2422315, 39000, 26);
        employees[3] = new Employe("Petechkin Petr", "admin", "peteckin@emplyees.ru", 2421145, 35000, 36);
        employees[4] = new Employe("Vladykin Ivan", "dir", "vladykin@emplyees.ru", 242461, 50000, 49);

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40)
                employees[i].printEmp();
        }
    }
}