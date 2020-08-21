package Lesson6;

public class Lesson6 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Bobby");
        System.out.println("Собакен первый. Кличка " + dog1.name);
        dog1.run(600);
        dog1.jump(0.3);
        dog1.swim(8);
        System.out.println("===============");
        Dog dog2 = new Dog("Doggy");
        System.out.println("Собакен второй. Кличка " + dog2.name);
        dog2.run(400);
        dog2.jump(0.3);
        dog2.swim(8);
        System.out.println("===============");
        Cat cat1 = new Cat("Petty");
        System.out.println("Кошка 1. Кличка " + cat1.name);
        cat1.swim(10);
        cat1.jump(1);
        cat1.run(50);
    }
}
