package Polymorphism;

public class Movie {

  private String title;

  public Movie(String title) {
    this.title = title;
  }
  
  public void watchMovie(){
    String instanceType = this.getClass().getSimpleName();
    System.out.println(title + " is a " + instanceType + " film");
  }

  public static Movie getMovie(String type, String title){
    
    return switch (type.toUpperCase().charAt(0)){
      case 'A' -> new Adventure(title);
      case 'C' -> new Comedy(title);
      case 'S' -> new ScienceFiction(title);
      default -> new Movie(title);
    };
  }
  
}

class Adventure extends Movie{
  public Adventure(String title) {
    super(title);
  }

  @Override
  public void watchMovie() {
    super.watchMovie();
    System.out.printf(".. %s%n".repeat(3), 
            "pleasent scene",
                      "scary music",
                      "something bad happened");    
  }
}

class Comedy extends Movie{

  public Comedy(String title) {
    super(title);
  }

  @Override
  public void watchMovie() {
    super.watchMovie();
    System.out.printf(".. %s%n".repeat(3), 
            "funny thing happens",
                      "something even funnier happens",
                      "good ending");   
  }

  public void watchComedy(){
    System.out.println("Watching a Comedy !");
  }

  
}

class ScienceFiction extends Movie{

  public ScienceFiction(String title) {
    super(title);
  }

  @Override
  public void watchMovie() {

    super.watchMovie();
    System.out.printf(".. %s%n".repeat(3), 
            "alines try to invade earth",
                      "soldiers fight aliens",
                      "no cannon ending");   
  }
  
  
}