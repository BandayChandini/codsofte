import java.util.Random;
import java.util.Scanner;

class Gaming{
    public int generatednumber;
    public int inputNumber;
    public int noOfGuesses = 0;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    Gaming(){ 
        Random rand = new Random();
        this.generatednumber = rand.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if (inputNumber==generatednumber){
            System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", generatednumber, noOfGuesses);
            return true;
        }
        else if(inputNumber<generatednumber){
            System.out.println("Too low...");
        }
        else if(inputNumber>generatednumber){
            System.out.println("Too high...");
        }
        return false;
    }

}
public class NumberGame {
    public static void main(String[] args) {
        Gaming g = new Gaming();
        boolean b= false;
        while(!b){
        g.takeUserInput();
        b = g.isCorrectNumber();
        }
       /* 1. Generate a random number within a specified range, such as 1 to 100.

        2. Prompt the user to enter their guess for the generated number.

        3. Compare the user's guess with the generated number and provide feedback on whether the guess
        is correct, too high, or too low.

        4. Repeat steps 2 and 3 until the user guesses the correct number.

        You can incorporate additional details as follows:

        5. Limit the number of attempts the user has to guess the number.
        6. Add the option for multiple rounds, allowing the user to play again.
        7. Display the user's score, which can be based on the number of attempts taken or rounds won.
    */}
}
