package Lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean isFull;

    public String getName() {
        return name;
    }

    public boolean isFull() {
        return isFull;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isFull = false;
    }
    public void eat(Plate p) {
        if(p.getFood() < appetite){
            System.out.println("Котик " + name + " останется голоден... Мало корма");
            isFull = false;
        }
        else {
            System.out.println("Котик " + name + " кушает " + appetite + " еды" + "\n" + "Котик " + name + " уже накормлен");
            p.decreaseFood(appetite);
            isFull = true;
        }
    }
}
