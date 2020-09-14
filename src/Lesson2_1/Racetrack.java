package Lesson2_1;

public class Racetrack extends Adventure{
    protected String type;
    protected int metrix;

    public Racetrack(String type, int metrix) {
        this.type = type;
        this.metrix = metrix;
    }

    public int getMetrix() {
        return metrix;
    }

    @Override
    public String getType() {
        return type;
    }
}
