package flashcards;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input the number of cards:");
        int cardcount = Integer.parseInt(br.readLine());
        Map<String,String> cardToDefinition = new HashMap<>();
        Map<String,String> definitionToCard = new HashMap<>();
        for (int i = 0; i < cardcount; i++) {
            System.out.println("The card #"+(i+1)+":");
            String card = br.readLine();
            System.out.println("The definition of the card #"+(i+1)+":");
            String def = br.readLine();
            cardToDefinition.put(card,def);
            definitionToCard.put(def,card);
        }

        for (Map.Entry<String, String> entry : cardToDefinition.entrySet()) {
            System.out.println("Print the definition of \""+entry.getKey()+"\":");
            String answer = br.readLine();
            if (entry.getValue().equals(answer)) System.out.println("Correct answer.");
            else
                System.out.println("Wrong answer (the correct one is \""+entry.getValue()+"\""+(definitionToCard.containsKey(answer)?
                        ", you've just written a definition of \""+definitionToCard.get(answer) +"\" card).": ")."));
        }

    }
}