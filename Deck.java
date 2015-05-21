import java.util.*;

public class Deck {
   private ArrayList<Card> deck;
   private Random rng = new Random();

   public Deck(){
      deck = new ArrayList<Card>();
      //TODO: Add a card (2-14) of each suit (h,s,d,c)
      for(int i=2; i<=14; i++){
        //for each number add one from each suit
         Card heart = new Card(i,"h");
         Card diamond = new Card(i, "d");
         Card spade = new Card(i,"s");
         Card clubs = new Card(i,"c");
         //add to the ArrayList
         deck.add(heart);
         deck.add(diamond);
         deck.add(spade);
         deck.add(clubs);
      }
   }

   public Card remove(){
      int rand = rng.nextInt(deck.size()-1);
      return deck.remove(rand);
   }

   public String toString(){
      return deck.toString();
   }
}
