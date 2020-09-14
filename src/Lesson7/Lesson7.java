package Lesson7;

public class Lesson7 {
    public static void main(String[] args) {
        Cat[] cat = {
                new Cat("Barsik", 5),
                new Cat("Murka", 5),
                new Cat("Ryzschik", 5),
                new Cat("Muha", 5),
        };
        Plate plate = new Plate(4);
        plate.info();
        eating(cat,plate);
        plate.addFood(11);
        plate.info();
        eating(cat,plate);
        plate.info();
        plate.addFood(6);
        plate.info();
        eating(cat,plate);
        plate.info();
    }
    // кормление голодных котов из одной миски
    public static void eating(Cat[] cat, Plate plate){
        for (Cat value : cat) {
            if (value.isFull()) {
                System.out.println("Котик " + value.getName() + " сыт");
            } else {
                System.out.println("Котик " + value.getName() + " голоден");
                value.eat(plate);
            }
        }
    }
    // Для расширения:
    // Объединить в функцию "кормление+заполнение+вывод количества оставшегося корма в миске". Учесть если коты наедаются за один присест.
    // Доработать так, чтобы сытым корм не предлагать.
    // Добавить рандом к "аппетитам" котов и ввод количества корма с консоли. Хозяин не должен знать на сколько голодны коты.
    // Отдельно реализовать вариант (потом заменить), где коты с разными аппетитами одновременно(!) едят из тарелочки.
}