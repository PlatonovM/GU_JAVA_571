package Lesson6;

import java.util.Random;

public class Animal {
    protected String name;
    protected String type;
    protected int maxRun;
    protected int maxSwim;
    protected double maxJump;
    Random random = new Random();
    public Animal(String name) {
        this.name = name;
    }

    public void run(int metr){
        if(this.maxRun > metr){
            System.out.println("run: true");
        }
        else System.out.println("run: false");
    }
    public void swim(int metr){
        if(this.maxSwim > metr){
            System.out.println("swim: true");
        }
        else System.out.println("swim: false");
    }
    public void jump(double metrHeight){
        if(this.maxJump > metrHeight){
            System.out.println("jump: true");
        }
        else System.out.println("jump: false");
    }
}