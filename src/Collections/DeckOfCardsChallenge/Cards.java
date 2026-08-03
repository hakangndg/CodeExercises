package Collections.DeckOfCardsChallenge;

import java.util.ArrayList;
import java.util.List;

public class Cards {

  public enum Suits{
  CLUB, DIAMOND, HEART, SPADE
  };

  private Suits suit;
  private String face; //either the number of the card or the face value of the card Jack,Queen,King or Ace
  private int rank;

  public Cards(Suits suit, String face, int rank) {
    this.suit = suit;
    this.face = face;
    this.rank = rank;
  }

 @Override
  public String toString() {

    //abbreviated face value
    String shortenedFace = switch (this.face) {
      case "Jack" -> "J";
      case "Queen" -> "Q";
      case "King" -> "K";
      case "Ace" -> "A";
      default -> this.face; // if it's normal integer
    };

   
    char suitSymbol = switch (this.suit) {
        case CLUB -> (char) 9827;     // ♣
        case DIAMOND -> (char) 9830;  // ♦
        case HEART -> (char) 9829;    // ♥
        case SPADE -> (char) 9824;    // ♠
    };

    return shortenedFace + suitSymbol + " (" + this.rank + ")";
  }

  public static Cards getNumericCard(Suits suit, int number) {
    if(number >= 1 && number <= 10) {
      return new Cards(suit, String.valueOf(number), number);
    }
    throw new IllegalArgumentException("Invalid value");
  }

  public static Cards getFaceCard(Suits suit, char abbrev) {
    String faceName;
    int rankValue;

    switch (Character.toUpperCase(abbrev)) {
        case 'J':
            faceName = "Jack";
            rankValue = 11; 
            break;
        case 'Q':
            faceName = "Queen";
            rankValue = 12; 
            break;
        case 'K':
            faceName = "King";
            rankValue = 13; 
            break;
        case 'A':
            faceName = "Ace";
            rankValue = 14; 
            break;
        default:
            throw new IllegalArgumentException("Invalid value");
    }

    return new Cards(suit, faceName, rankValue);
  }


  public static List<Cards> getStandardDeck() {
    List<Cards> deck = new ArrayList<>();

    
    for (Suits suit : Suits.values()) {
        
        
        for (int i = 2; i <= 10; i++) {
            deck.add(getNumericCard(suit, i));
        }
        
        deck.add(getFaceCard(suit, 'J'));
        deck.add(getFaceCard(suit, 'Q'));
        deck.add(getFaceCard(suit, 'K'));
        deck.add(getFaceCard(suit, 'A'));
    }

    return deck; // 52 kartlık tertemiz destemiz hazır!
  }


  public static void printDeck(String description, List<Cards> deck, int rows) {
    System.out.println("--- " + description + " ---");
    
    // total number of cards
    int totalCards = deck.size();
    
    
    // calculating the number of cards per row
    int cardsPerRow = totalCards / rows;

    for (int i = 0; i < totalCards; i++) {
        // printing out the cards
        System.out.print(deck.get(i) + " ");

        // if we reach the row capacity, we continue with next line
        if ((i + 1) % cardsPerRow == 0) {
            System.out.println();
        }
    }
    System.out.println(); 
  }

  //printDeck function with no parameter
  public static void printDeck(List<Cards> deck) {
    // calling the actual function to simplify
    printDeck("Current Deck", deck, 4);
  }


}
  