package ru.geekbrains.lesson8;

public class App {

    public static final int PARTICLE_NUMB = 3;
    public static final int OBSTACLE_NUMB = 2;

    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();

    }

    public static void task1() {

        Human human = new Human("Джонни", 60, 85);
        Cat cat = new Cat("Пьер", 135, 30);
        Robot robot = new Robot("Дровосек", 3000, 3000);
        Treadmill treadmill = new Treadmill(100);
        Wall wall = new Wall(50);

        System.out.println("Задание 1:");

        human.runFree();
        human.jumpFree();
        cat.runFree();
        cat.jumpFree();
        robot.runFree();
        robot.jumpFree();

        System.out.println();

    }

    public static void task2() {

        Human human = new Human("Джонни", 60, 85);
        Cat cat = new Cat("Пьер", 135, 30);
        Robot robot = new Robot("Дровосек", 3000, 3000);
        Treadmill treadmill = new Treadmill(120);
        Wall wall = new Wall(70);

        System.out.println("Задание 2:");

        human.runTreadmill(treadmill);
        human.jumpWall(wall);
        cat.runTreadmill(treadmill);
        cat.jumpWall(wall);
        robot.runTreadmill(treadmill);
        robot.jumpWall(wall);

        System.out.println();

    }

    public static void task3() {

        Actions[] participantsArray = new Actions[PARTICLE_NUMB];

        participantsArray[0] = new Human("Джонни", 60, 85);
        participantsArray[1] = new Cat("Пьер", 135, 30);
        participantsArray[2] = new Robot("Дровосек", 3000, 3000);

        Obstacle[] obstacleArray = new Obstacle[OBSTACLE_NUMB];

        obstacleArray[0] = new Treadmill(120);
        obstacleArray[1] = new Wall(70);

        System.out.println("Задание 3:");

        for (Actions member : participantsArray) {
            member.runTreadmill(80);
            member.jumpWall(50);
        }

        System.out.println();

    }

    public static void task4() {

        Actions[] participantsArray = new Actions[PARTICLE_NUMB];

        participantsArray[0] = new Human("Джонни", 60, 85);
        participantsArray[1] = new Cat("Пьер", 135, 30);
        participantsArray[2] = new Robot("Дровосек", 3000, 3000);

        Obstacle[] obstacleArray = new Obstacle[OBSTACLE_NUMB];

        obstacleArray[0] = new Treadmill(120);
        obstacleArray[1] = new Wall(70);

        System.out.println("Задание 4:");

        for (Actions member : participantsArray) {
            if (member.runTreadmillAgain(120) && member.jumpWallAgain(70)) {
                System.out.println(member.getName() + " " + "прошел все препятствия! Конгрэтюлейшнс! :>");
            }
            if (member.runTreadmillAgain(120) && !member.jumpWallAgain(70)){
                System.out.println(member.getName() + " " + "пробежал дорожку,но не прошел, стену. Выбывает :(");
            }
            if (!member.runTreadmillAgain(120)) {
                System.out.println(member.getName() + " " + "не справился с дорожкой.. Скажем ему 'прощай'!");
            }
        }

        System.out.println();

    }

}