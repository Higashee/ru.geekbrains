package ru.geekbrains.lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
//
    public void eat(Plate p) {
        if(p.food >= appetite){
            p.decreaseFood(appetite);
            satiety = true;
            System.out.println(name + " сытый!");
        }
        else{
            System.out.println(name + " хочет больше еды! В тарелке всего " + p.food + " а котик хочет " + appetite + " !!!");
            System.out.println(name + " не остался сыт :(");
        }

    }

}
