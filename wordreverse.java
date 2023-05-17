import java.util.Scanner;

public class wordreverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write a random word: ");
        String word = scanner.nextLine();

        StringBuilder wordReverse = new StringBuilder(word);
        wordReverse.reverse();
        System.out.println(wordReverse);
    }
}
