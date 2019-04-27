package team;

public class Sportsman implements Ability {

    private String name;

    private int runningSpeed;
    private int jumpHeight;
    private int swimmingSpeed;
    private int timeResult = 0;

    public Sportsman(String name, int jumpHeight, int runningSpeed, int swimmingSpeed) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.runningSpeed = runningSpeed;
        this.swimmingSpeed = swimmingSpeed;
    }

    public String getName() {
        return this.name;
    }
    // Методы бега и плавания возвращают время преодаления дистанции
    public int run(int distance) {
        int time;
        time = distance/this.runningSpeed;
        return time;
    }

    public int swim(int distance) {
        int time;
        time = distance/this.swimmingSpeed;
        return time;
    }
    // Метод Jump() возвращает результат смогли спортсмен преодолеть препятствие
    public boolean jump(int height){
        return this.jumpHeight >= height;
    }

    public void setTimeResult(int timeResult) {
        this.timeResult = timeResult;
    }

    public int getTimeResult() {
        return this.timeResult;
    }
}