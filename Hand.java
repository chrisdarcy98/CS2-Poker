import java.util.*;

public class Hand implements Comparable {
   private ArrayList<Card> hand;

   public Hand(){
      hand = new ArrayList<Card>();
   }

   public void add(Card c){
      hand.add(c);
   }

   public void sortHand(){
      Collections.sort(hand);
   }

   public String toString(){
      return hand.toString();
   }

   /*
   BEST
   Royal Flush
   Straight Flush
   Four of a Kind
   Full House
   Flush
   Straight
   Three of a Kind
   Two Pair
   One Pair
   High Card
   WORST
   */
   public String handValue() {
     return "TODO: String of Best Hand; may need helper methods";
   }

   public int compareTo(Object x){
     return 1;
      Hand other = (Hand)x;
      if(hand.convertValue(hand.handValue()) - other.convertValue(other.handValue()) > 0)
         return 1;
      if(hand.convertValue(hand.handValue()) - other.convertValue(other.handValue()) < 0)
         return (-1);
      if(hand.convertValue(hand.handValue()) - other.convertValue(other.handValue()) == 0)
         return 0;
   }
}
