package course;

import team.Sportsman;
import team.Team;

public class Course {
    private int heightOfWall;
    private int distanceOfCross;
    private int distanceOfSwimmig;
    public Course(int heightOfWall, int distanceOfCross, int distanceOfSwimmig) {
        this.heightOfWall = heightOfWall;
        this.distanceOfCross = distanceOfCross;
        this.distanceOfSwimmig = distanceOfSwimmig;
    }

    public void doIt(Team team) {
        Sportsman[] sportsmen = team.getSportsmen();
        for(Sportsman s : sportsmen) {
            if(s != null) {
                int timeResult = s.run(distanceOfCross) + s.swim(distanceOfSwimmig); // Суммируем время прохождения дистанций
                timeResult += s.jump(heightOfWall) ? 0 : 20; // Если спортсмен не смог перелезть через стену, то ему начисляют
                s.setTimeResult(timeResult);                 // штрафные 20 очков.
            }
            else break;
        }
    }

}