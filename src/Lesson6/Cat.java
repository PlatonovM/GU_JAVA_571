package Lesson6;

public class Cat extends Animal {
    public Cat(String name){
        super(name);
        this.maxRun = 200;
        this.maxJump = 2;
        this.type = "Cat";
    }
    @Override
    public void swim(int metr){
        System.out.println("swim: false - DEFAULT!");
    }
}
