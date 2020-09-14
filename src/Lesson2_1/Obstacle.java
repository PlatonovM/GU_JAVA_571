package Lesson2_1;

public class Obstacle extends Adventure {
    protected String type;
    protected int metrix;

    public int getMetrix() {
        return metrix;
    }

    public Obstacle(String type, int metrix) {
        this.type = type;
        this.metrix = metrix;
    }

    @Override
    public String getType() {
        return type;
    }
}
