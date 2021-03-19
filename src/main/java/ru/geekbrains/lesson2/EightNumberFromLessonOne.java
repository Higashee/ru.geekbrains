package ru.geekbrains.lesson2;

public class EightNumberFromLessonOne {
    //Не сделал задачу 8 с прошлой лекции, потому сдаю с этим Д/З.
    public static void main(String[] args) {

        int a = 1300;
        if(a % 100 == 0 & a % 4 == 0 & a % 400 == 0)
        {
            System.out.println(a + " год является високосным");

        }
        else if (a % 4 == 0 & a % 100 ==0){
            System.out.println(a + " год не является високосным");
        }
        else if( a % 4 == 0){
            System.out.println(a + " год является високосным");
        }
            else

            System.out.println(a + " год не является високосным");
    }
}
//Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.