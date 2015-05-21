import java.util.*;

int points = -1;
int points2;
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

   //---------------------Divider---------------------
   //---------------------Divider---------------------
   //---------------------Divider---------------------
   //---------------------Divider---------------------

   private boolean checkFlush(){

   }
   private boolean checkStrait(){

   }
   private int checkPairs(){

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
     if(points = -1){
       if(hand.flush() == true && hand.strait() == true){
         if(hand.get(5) == 14){
           return "Royal Flush";
           points = 0;
         }
         else{
           return "Strait Flush";
           points = 1;
         }
       }
       //idk how to do full house
       if(hand.pairs() == 4){
         return "Four of a Kind";
         points = 2;

       }
       else if(hand.pairs() == 5){
         return "Full House"
         points = 3;
       }
       else if(hand.pair() == 3){
         return "Three of a Kind";
         points = 6;
       }
       else if(hand.pair() == 2){
         return "Two pair";
         points = 7;
       }
       else if(hand.pair() == 1){
         return "Two of a Kind";
         points = 8;
       }
       else if(hand.pair() == 0){
         return "High Card";
         points = 9;
       }
       else if(hand.flush() == True){
         return "Flush";
         points = 4;
       }
       else if(hand.strait() == True){
         return "Strait";
         points = 5;
       }
     }
     else {
       if(hand.flush() == true && hand.strait() == true){
         if(hand.get(5) == 14){
           return "Royal Flush";
           points2 = 0;
         }
         else{
           return "Strait Flush";
           points2 = 1;
         }
       }
       //idk how to do full house
       if(hand.pairs() == 4){
         return "Four of a Kind";
         points2 = 2;

       }
       else if(hand.pairs() == 5){
         return "Full House"
         points2 = 3;
       }
       else if(hand.pair() == 3){
         return "Three of a Kind";
         points2 = 6;
       }
       else if(hand.pair() == 2){
         return "Two pair";
         points2 = 7;
       }
       else if(hand.pair() == 1){
         return "Two of a Kind";
         points2 = 8;
       }
       else if(hand.pair() == 0){
         return "High Card";
         points2 = 9;
       }
       else if(hand.flush() == True){
         return "Flush";
         points2 = 4;
       }
       else if(hand.strait() == True){
         return "Strait";
         points2 = 5;
       }
     }


   }
   private boolean flush(){
     int t;
     for(int i=0; i<hand.size(); i++){
       if(hand.get(i).value = hand.get(i+1).value+1){
         t++;
       }
     }
     if(t=5){
       return True;
     }
     else{
       return False;
     }
   }
   private boolean strait(){
     String testSuit=hand.get(0).suit;
     //tests for each card c in the hand
     for(Card c : hand){
       if(!(testSuit.equals(c.suit))){
         return false;
       }
     }
     return true;
   }
   private int pairs(){
     int set=0;
     int match;
     int tres=0;
     int quatro=0;
     //checks matches for each card to each other
     for(Card card : hand){
       match=0;
       System.out.print(card.value+": ");
       for(int i=0; i<hand.size(); i++){
         if(card.value==hand.get(i).value){
          //adds for every match to cards in deck
          match++;
         }
       }
       match--; //card would count itself
       if(match == 1){
         //indicates a set
         set++;
       }
       if(match== 2){
         //indicates three of a kind
         tres++;
       }
       if(match == 3){
         //indicates four of a kind
         quatro++;
       }
     }
     set=set/2;
     //four of a kind
     if(quarto==1){
       return 4;
     }
     //full house
     else if(tres == 1 && set ==1){
       return 5;
     }
     //three of a kind
     else if(tres == 1){
       return 3;
     }
     //two pair
     else if(set==2){
       return 2;
     }
     //pair
     else if(set==1){
       return 1;
     }
     //nothing so high card
     else{
       return 0;
     }


   }

   public int compareTo(Object x){
      if(points < points2){
        return 1;
      }
      if(points > points2){
        return -1;
      }
      else{
        return 0;
      }
   }
}
