package RandomNumberGame;

import java.util.Random;
import java.util.Scanner;
public class RandomNumberGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Random random = new Random();

        String name;
        int number;
        int playerGuess = 0;
        System.out.println("WELCOME TO THE GAME");
        System.out.println("ENTER YOUR NAME");
        name = input.nextLine();
        System.out.println(name + " YOU'RE WELCOME !!");


        System.out.println("START GAME");
        System.out.println(" YES CLICK y ");
        System.out.println(" NO CLICK n TO EXIT");
        char playerReply = input.next().charAt(0);
        if(playerReply!='y'){

            while(playerReply!='y'){
                if(playerReply=='n')System.exit(0);
                else
            System.out.println("START GAME");
            System.out.println(" YES CLICK y ");
            System.out.println("NO CLICK n");
                playerReply = input.next().charAt(0);


            }



        }

        if(playerReply=='y') {

            number = random.nextInt(20);


            System.out.println("NOW GUESS A NUMBER");

                for (int i = 0; i < 5; i++) {

                        playerGuess = input.nextInt();


                    if (playerGuess == number) {
                        System.out.println("CONGRATULATIONS YOU WON");

                    } else if (playerGuess != number) {
                       if(i==4)continue;
                       System.out.println("TRY A LOWER OR HIGHER NUMBER");



                    }



                }
                System.out.println("GAME OVER");
               System.out.println(" THE ANSWER WAS "+number);

        }
    }
}//TODO : INCLUDE TODAY THE GUESS HIGHER OR LOWER FEATURE AND DISPLAY RESULT WHEN USER LOSES A GAME

