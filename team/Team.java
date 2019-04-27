package team;

public class Team {

    private Sportsman[] sportsmen = new Sportsman[10];

    public Team(Sportsman... sportsmen) {
        int i = 0;
        for(Sportsman s : sportsmen) {
            this.sportsmen[i] = s;
            i++;
        }
    }

    public Sportsman[] getSportsmen() {
        Sportsman[] men = this.sportsmen;
        return men;
    }

    public void showResults() {
        sort(); // Сортировка массива спротсменов по результатам.
        for(Sportsman s : sportsmen) {
            if(s != null)
                System.out.println(s.getName() + " с результатом: " + s.getTimeResult());
        }
    }

    private void sort() { // Обычная сортировка пузырьком
        boolean isSorted = false;
        while(!isSorted) {
            isSorted = true;
            for(int i = 0; i < (sportsmen.length - 1); i++) {
                if(sportsmen[i + 1] != null) {
                    if (sportsmen[i].getTimeResult() > sportsmen[i + 1].getTimeResult()) {
                        Sportsman buff = sportsmen[i];
                        sportsmen[i] = sportsmen[i + 1];
                        sportsmen[i + 1] = buff;
                        isSorted = false;
                    }
                }
                else break;
            }
        }
    }

}