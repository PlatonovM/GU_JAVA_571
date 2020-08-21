package Lesson6;

public class Dog extends Animal {
    public Dog(String name){
        super(name);
        this.maxJump = 0.5;
        this.maxRun = random.nextInt(202) + 399; // от 400 до 600 метров
        this.maxSwim = 10;
        this.type = "Dog";
    }
}