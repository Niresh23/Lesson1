import course.Course;
import team.Sportsman;
import team.Team;

public class Main {

    public static void main(String[] args) {
        Course c = new Course(4, 5000, 250); // Создаем полосу препятствий
        Team team = new Team(   new Sportsman("Ivan", 3, 10, 3),
                new Sportsman("Semen", 4,12,4),
                new Sportsman("Grisha", 5, 9,2),
                new Sportsman("Anton", 4,10,5)); // Создаем команду
        c.doIt(team); // Просим команду пройти полосу
        team.showResults(); // Показываем результаты
    }
}