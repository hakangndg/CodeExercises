package Polymorphism;

import java.util.Scanner;

public class Main {

  public static void main(String args[]){

    /*Movie movie = new Movie("Star Wars"); //general movie
    movie.watchMovie();

    Movie adventure = new Adventure("Star Wars"); //adventure movie
    adventure.watchMovie();

    Movie funny = new Comedy("Sag Saglim"); //comedy movie
    funny.watchMovie();

    Movie scifi = new ScienceFiction("Arrival"); //science fiction movie
    scifi.watchMovie();

    Movie theMovie = Movie.getMovie("Adventure", "Star Wars"); //creating a movie by getMovie function
    theMovie.watchMovie();*/

   // Movie movie1 = Movie.getMovie("science fiction", "Arrival");
   // movie1.watchMovie();

    Scanner s = new Scanner(System.in);
    while(true){
      System.out.println("Enter a type. 'A' for Adventure ; 'C' for Comedy ; 'S' for Science Fiction ; 'Q' for quit");
      String type = s.nextLine();
      if("Qq".contains(type)){
        break;
      }
      System.out.println("Please enter the title of the movie");
      String title = s.nextLine();
      Movie movie = Movie.getMovie(type, title);
      movie.watchMovie();
    }

    //Adventure adv = Movie.getMovie("A","Adventure Time"); //wrong usage
    Adventure adv = (Adventure) Movie.getMovie("A", "Adventure Time");
    adv.watchMovie();

    var airplane = Movie.getMovie("C","Airplance");

    var comedy = new Comedy("Sag Saglim"); //getting determined in the run time
    comedy.watchComedy(); //access granted fora method which specific to comedy class
  }
  
}
