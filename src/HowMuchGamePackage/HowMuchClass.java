package HowMuchGamePackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HowMuchClass {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            System.out.println("Enter number between 1 and 100");
            int guessNumber = (int)(Math.random() * 100 + 1);
            while (true){
                try {
                    int yourNumber = Integer.parseInt(reader.readLine());

                    if (yourNumber == guessNumber) {
                        System.out.println("You won");
                        break;
                    }else if (yourNumber > guessNumber){
                        System.out.println("Is is too high");
                    }else if (yourNumber < guessNumber){
                        System.out.println("It is too low");
                    }
                }catch (Exception e){
                    System.out.println("It is not a number. Enter number between 1 and 100");
                }
            }
            System.out.println("Would you like to play again? Enter y/n");
            String decision = reader.readLine();
            if (decision.equalsIgnoreCase("n")){
                System.out.println("Bye - Bye");
                break;
            }
        }
        reader.close();
    }
}
