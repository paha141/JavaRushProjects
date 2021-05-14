package gamehippodrome;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    private List<Horse> horses;
    public static Hippodrome game;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    void run() throws InterruptedException{
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }
    void move(){
        for (int i = 0; i < horses.size(); i++)
            horses.get(i).move();
    }
    void print(){
        for (int i = 0; i < horses.size(); i++)
            horses.get(i).print();

        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public Horse getWinner(){
        double maxDistance = 0;
        Horse leaderHorse = null;
        for (int i = 0; i < horses.size(); i++) {
            if (horses.get(i).getDistance() > maxDistance) {
                leaderHorse = horses.get(i);
                maxDistance = horses.get(i).getDistance();
            }
        }
        return leaderHorse;
    }

    public void printWinner(){
        System.out.println("Winner is " + getWinner().getName() + "!");
    }

    public static void main(String[] args) throws InterruptedException {
        List <Horse> horses = new ArrayList<>();

        Horse max = new Horse("Max", 3, 0);
        Horse doom = new Horse("Doom", 3, 0);
        Horse hog = new Horse("Hog", 3, 0);

        horses.add(max);
        horses.add(doom);
        horses.add(hog);

        game = new Hippodrome(horses);
        game.run();

        game.printWinner();
    }
}
