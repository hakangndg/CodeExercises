package SmallScaled;
public class Fish extends Animal {

  private int gills;
  private int fins;

  public Fish(String type, double weight, int gills, int fins){
    super(type, "small", weight);
    this.gills = gills;
    this.fins = fins;
  }
  
}
