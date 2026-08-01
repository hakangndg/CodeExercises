package Generics.Challenge;

import java.util.*;

public class Parks extends Point{

  private String name;
  private String type;
  private double[] googledLocation = new double[2];

  public Parks(String name, String type, double latitude, double longitude) {
    this.name = name;
    this.type = type;
    this.googledLocation[0] = latitude;
    this.googledLocation[1] = longitude;
  }

  public double[] getGoogleLocation() {
    return googledLocation;
  }

  @Override
  public void render() {
    System.out.println("Render " + name + " as a POINT " + Arrays.toString(googledLocation));
  }

}
