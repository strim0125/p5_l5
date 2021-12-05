package ru.geekbrains.common.part2_lesson4;

class Employe {
        private String fio;
        private String post;
        private String email;
        private int phone;
        private int salary;
        private int age;

    public Employe (String fio, String post, String email, int phone, int salary, int age) {
            this.fio = fio;
            this.post = post;
            this.email = email;
            this.phone = phone;
            this.salary = salary;
            this.age = age;
        }

        public void printEmp(){
            System.out.printf("fio " + fio + "post " + post + "email " + email +
                    "salary " + salary + "age =" + age);
        }

    public int getAge() {
        return age;
    }
}
