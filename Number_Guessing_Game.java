import java.util.Random;
import java.util.Scanner;

class Game1 {
    public int number;
    public int inputNumber;
    public int noOfGuesses;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    Game1() {
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    void TakeUserInput() {
        System.out.println("Guesses The Number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    boolean isCorrectInput() {
        noOfGuesses++;
        if (inputNumber == number) {
            return true;
        } else if (inputNumber < number) {
            System.out.println("too low...");
        } else if (inputNumber > number) {
            System.out.println("too high...");
        }
        return false;
    }
}
public class Number_Guessing_Game{
    public static void main(String[] args) {
        Game1 g = new Game1();
        boolean b = false;
        while(!b){
            g.TakeUserInput();
            b = g.isCorrectInput();
        }
    }
}