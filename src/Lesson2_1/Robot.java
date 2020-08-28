package Lesson2_1;

public class Robot implements Run, Jump, Participants {
    protected String name;
    protected int jumpMetrix;
    protected int runMetrix;

    public Robot(String name, int jumpMetrix, int runMetrix) {
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
        System.out.println("Бег по дорожке "+adventure.getMetrix()+ " м.");
        run();
        if(adventure.getMetrix() <= runMetrix){
            System.out.println("Робот пробежал дорожку");
        } else {
            System.out.println("Робот не пробежал дорожку");
        }
    }

    @Override
    public void jumpObstacle(Adventure adventure) {
        System.out.println("Впереди барьер высотой " + adventure.getMetrix()+ " м.");
        jump();
        if(jumpMetrix >= adventure.getMetrix()){
            System.out.println("Робот перепрыгнул барьер");
        } else {
            System.out.println("Робот не перепрыгул барьер");
        }
    }
}