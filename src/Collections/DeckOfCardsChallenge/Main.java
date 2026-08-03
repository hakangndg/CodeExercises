package Collections.DeckOfCardsChallenge;

import java.util.List;

public class Main {

  public static void main(String[] args) {
    
    List<Cards> deck = Cards.getStandardDeck();
    Cards.printDeck(deck);
  }
  
}
