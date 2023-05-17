import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GameCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        ArrayList<String> deckList = new ArrayList<String>();
        ArrayList<String> deckSteve = new ArrayList<String>();
        ArrayList<String> deckJosh = new ArrayList<String>();
        deckList.addAll(Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "A"));
        
        System.out.print("hand deck size?  ");
        int sizeHand = scanner.nextInt();
        System.out.println("--------------------------");

        if (sizeHand <= 12 & sizeHand > 0){
            int scoreSteve = 0;
            int scoreJosh = 0;
            for (int i = 0; i < sizeHand; i++){
                int randomNumberSteve = random.nextInt(13);
                deckSteve.add(deckList.get(randomNumberSteve));
                System.out.println("Steve hand: " +deckSteve.get(i));
                int randomNumberJosh = random.nextInt(13);
                deckJosh.add(deckList.get(randomNumberJosh));
                System.out.println("Josh hand: " +deckJosh.get(i));

                if (randomNumberSteve > randomNumberJosh){
                    System.out.println("Steve won this round! ");
                    System.out.println("--------------------------");
                    scoreSteve += 1;

                }else if (randomNumberJosh > randomNumberSteve){
                    System.out.println("Josh won this round! ");
                    System.out.println("--------------------------");
                    scoreJosh += 1;

                }else {
                    System.out.println("Tie! ");
                    System.out.println("--------------------------");
                }
            }
            System.out.println("End of the game, the players' hands were: ");
            System.out.println("Steve: " +deckSteve);
            System.out.println("Josh: " +deckJosh);
            if (scoreSteve > scoreJosh){
                System.out.println("Steve win!");
            } else if(scoreJosh > scoreSteve){
                System.out.println("Josh win! ");
            } else{
                System.out.println("Tie game!");
            }

        } else{
            System.out.println( "Size hand invalid! ");
        }
        scanner.close();
    }
}
