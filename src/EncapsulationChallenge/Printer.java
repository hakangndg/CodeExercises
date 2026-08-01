package EncapsulationChallenge;

public class Printer {

  private int tonerLevel;
  private int pagesPrinted;
  private boolean duplex;

  public Printer(int tonerLevel, boolean duplex){
    this.tonerLevel = (tonerLevel < 0 || tonerLevel > 100) ? -1 : tonerLevel;
    this.duplex = duplex;
  }

  public int addToner(int tonerAmount){
    int tempAmount = tonerAmount + tonerLevel;
    if(tempAmount < 0 || tempAmount > 100){
      System.out.println("Insufficient toner level !!");
      return -1;
    }
    tonerLevel += tonerAmount;
    return tonerLevel;
  }

  public int printPages(int pages){
    int pagesNeeded = (duplex) ? (pages / 2) + (pages % 2) : pages;
    pagesPrinted += pagesNeeded;
    return pagesNeeded; 
  }

  public int getTonerLevel() {
    return tonerLevel;
  }

  public int getPagesPrinted() {
    return pagesPrinted;
  }

  public boolean isDuplex() {
    return duplex;
  }
  
  
}
