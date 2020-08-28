package Lesson2_1;

public class Main {
    public static void main(String[] args) {
        Participants[] participants = {
                new Cat("Cat1",3,25),
                new Human("Jack", 4,500),
                new Robot("R2D2", 1,5000)
        };

        Adventure[] adventures = {
                new Racetrack("Track",10),
                new Obstacle("Bar",1),
                new Racetrack("Track",40),
                new Obstacle("Bar",3),
                new Racetrack("Track",600)
        };

        for (Adventure adventure : adventures) {
            for (Participants part : participants) {
                if ("Track".equals(adventure.getType())) {
                    part.runDistantion(adventure);
                } else {
                    part.jumpObstacle(adventure);
                }
            }
        }
//      new Racetrack(10)
//      new Obstacle(1);
//      new Racetrack(40);
//      new Obstacle(3);
//      new Racetrack(600);


//        for(Participants part : participants){
//            part.runDistantion(new Racetrack(10));
//        }
//        for(Participants part : participants){
//            part.jumpObstacle(new Obstacle(1));
//        }
//        for(Participants part : participants){
//            part.runDistantion(new Racetrack(40));
//        }
//        for(Participants part : participants){
//            part.jumpObstacle(new Obstacle(3));
//        }
//        for(Participants part : participants){
//            part.runDistantion(new Racetrack(600));
//        }

    }
}
