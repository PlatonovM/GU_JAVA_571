package Lesson2_1;

public class Cat implements Run, Jump, Participants {
    protected String name;
    protected int jumpMetrix;
    protected int runMetrix;

    public Cat(String name, int jumpMetrix, int runMetrix) {
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
        System.out.println("Бег по дорожке "+ adventure.getMetrix()+" м.");
        run();
        if(runMetrix >= adventure.getMetrix()){
            System.out.println("Кот пробежал дорожку");
        } else {
            System.out.println("Кот не пробежал дорожку");
        }
    }

    public void jumpObstacle(Adventure adventure) {
        System.out.println("Впереди барьер высотой " + adventure.getMetrix()+ " м.");
        jump();
        if(jumpMetrix >= adventure.getMetrix()){
            System.out.println("Кот перепрыгнул барьер");
        } else {
            System.out.println("Кот не перепрыгул барьер");
        }
    }
}
