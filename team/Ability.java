package team;

public interface Ability { // Интерфейс здесь лишний, я думаю.
    int run(int distance);
    boolean jump(int height);
    int swim(int swimmingDistance);
}