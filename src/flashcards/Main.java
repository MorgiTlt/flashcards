package flashcards;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input the number of cards:");
        int cardcount = Integer.parseInt(br.readLine());
        String[] cards = new String[cardcount];
        String[] definitions = new String[cardcount];
        for (int i = 0; i < cardcount; i++) {
            System.out.println("The card #"+(i+1)+":");
            cards[i] = br.readLine();
            System.out.println("The definition of the card #"+(i+1)+":");
            definitions[i] = br.readLine();
        }

        for (int i = 0; i < cards.length; i++) {
            System.out.println("Print the definition of \""+cards[i]+"\":");
            if (definitions[i].equals(br.readLine()))
                System.out.println("Correct answer.");
            else System.out.println("Wrong answer (the correct one is \""+definitions[i]+"\").");
        }
    }
}