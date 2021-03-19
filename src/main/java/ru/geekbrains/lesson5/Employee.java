package ru.geekbrains.lesson5;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private long salary;
    private int age;

    public static void main(String[] args) {

//Не совсем понял третье задание, "В классе Сотрудник создать метод, выводящий информацию о сотруднике в консоль, создавал метод, но employee1/2/3/4/5 ведь у меня на уровне другого метода и не могут вызываться в отдельном :<

//       System.out.println("Первый сотрудник: " + employee1.name + " | Позиция: " + employee1.position + " | Е-мэйл: " +
//               employee1.email + " | Телефон: " + employee1.phone + " | Зарплата: " + employee1.salary + " | Возраст: " + employee1.age);
//       System.out.println("Второй сотрудник: " + employee2.name + " | Позиция: " + employee2.position + " | Е-мэйл: " +
//               employee2.email + " | Телефон: " + employee2.phone + " | Зарплата: " + employee2.salary + " | Возраст: " + employee2.age);
//       System.out.println("Третий сотрудник: " + employee3.name + " | Позиция: " + employee3.position + " | Е-мэйл: " +
//               employee3.email + " | Телефон: " + employee3.phone + " | Зарплата: " + employee3.salary + " | Возраст: " + employee3.age);
//       System.out.println("Четвёртый сотрудник: " + employee4.name + " | Позиция: " + employee4.position + " | Е-мэйл: " +
//               employee4.email + " | Телефон: " + employee4.phone + " | Зарплата: " + employee4.salary + " | Возраст: " + employee4.age);
//       System.out.println("Пятый сотрудник: " + employee5.name + " | Позиция: " + employee5.position + " | Е-мэйл: " +
//               employee5.email + " | Телефон: " + employee5.phone + " | Зарплата: " + employee5.salary + " | Возраст: " + employee5.age);

        Employee[] empArr = new Employee[5];
        empArr[0] = new Employee("Васильев Пётр Яковлевич", "Менеджер", "vaspetr@mail.ru", "89812504142", 50000, 39);
        empArr[1] = new Employee("Добролюбов Анатолий Савельевич", "Строитель", "talktolik@mail.ru", "89148521938", 45000, 44);
        empArr[2] = new Employee("Расстрелов Яков Сергеевич", "Бригадир", "paupau@gmail.com", "89124721133", 68000, 37);
        empArr[3] = new Employee("Барсуков Борис Константинович", "Разнорабочий", "BBQ@yandex.ru", "89122232111", 30000, 27);
        empArr[4] = new Employee("Иванов Алексей Валерьевич", "Дизайнер", "lesha.design@mail.ru", "88005553535", 48000, 22);

        //System.out.println(empArr[0].name + " | " + empArr[0].position + " | " + empArr[0].email + " | " + empArr[0].phone + " | " + empArr[0].salary + " | " + empArr[0].age);

        for (int i = 0; i < empArr.length; i++) {
            if(empArr[i].age > 40){
                System.out.println(empArr[i].name + " | " + empArr[i].position + " | " + empArr[i].email + " | " + empArr[i].phone + " | " + empArr[i].salary + " | " + empArr[i].age);
            }

        }

    }


    public Employee(String name, String position, String email, String phone, long salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

}
