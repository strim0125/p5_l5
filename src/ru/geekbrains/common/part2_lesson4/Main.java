package ru.geekbrains.common.part2_lesson4;

public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivanov Ivan", "developer", "ivanov@emplyees.ru", 2421917, 23000, 21);
        employees[1] = new Employee("Petrov Andrey", "stroitel", "ivanov@emplyees.ru", 2421917, 23000, 31);
        employees[2] = new Employee("Sidorov Vasiliy", "developer", "ivanov@emplyees.ru", 2421917, 23000, 26);
        employees[3] = new Employee("Petechkin Petr", "developer", "ivanov@emplyees.ru", 2421917, 23000, 36);
        employees[4] = new Employee("Vladykin Ivan", "developer", "ivanov@emplyees.ru", 2421917, 23000, 49);

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40)
                employees[i].printEmp();
        }
    }
}