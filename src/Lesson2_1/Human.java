package Lesson2_1;

public class Human implements Run, Jump, Participants {
    protected String name;
    protected int jumpMetrix;
    protected int runMetrix;

    public Human(String name, int jumpMetrix, int runMetrix) {
        this.name = name;
        this.jumpMetrix = jumpMetrix;
        this.runMetrix = runMetrix;
    }

    @Override
    public void jump() {
        System.out.println(name+ " прыгает");
    }

    @Override
    public void run() {
        System.out.println(name + " бежит");
    }

    @Override
    public void runDistantion(Adventure adventure) {
        System.out.println("Бег по дорожке "+adventure.getMetrix()+" м.");
        run();
        if(runMetrix >= adventure.getMetrix()){
            System.out.println("Человек пробежал дорожку");
        } else {
            System.out.println("Человек не пробежал дорожку");
        }
    }

    public void jumpObstacle(Adventure adventure) {
        System.out.println("Впереди барьер высотой " + adventure.getMetrix()+ " м.");
        jump();
        if(jumpMetrix >= adventure.getMetrix()){
            System.out.println("Человек перепрыгнул барьер");
        } else {
            System.out.println("Человек не перепрыгул барьер");
        }
    }
}
