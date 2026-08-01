package Generics.Challenge;
import java.util.*;
public class Rivers extends Line {
    private String name;
    private String type;
    private double[][] googledLocation;

    public Rivers(String name, String type, double... coordinates) {
        this.name = name;
        this.type = type;
        
        int pairs = coordinates.length / 2;
        this.googledLocation = new double[pairs][2];

        for (int i = 0; i < pairs; i++) {
            this.googledLocation[i][0] = coordinates[i * 2];     // Latitude
            this.googledLocation[i][1] = coordinates[i * 2 + 1]; // Longitude
        }
    }


  @Override
  public void render() {
    System.out.println("Render " + name + " as a LINE " + Arrays.deepToString(googledLocation));
  }

  public double[][] getGoogleLocation() {
    return googledLocation;
  }


  

}
