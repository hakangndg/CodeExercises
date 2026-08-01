package EncapsulationChallenge;

public class Main {

  public static void main(String args[]){
    Printer printer = new Printer(50,true);
    System.out.println("initinal page is " + printer.getPagesPrinted());

    int pagesPrinted = printer.printPages(5);

    System.out.printf("current job pages %d, printer total : %d %n", pagesPrinted, printer.getPagesPrinted());
  }


  
}
