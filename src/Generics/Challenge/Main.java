package Generics.Challenge;

public class Main {

  public static void main(String[] args) {

    Parks yellowstone = new Parks("Yellowstone", "National Parks", 44.4882, -110.5916);
    Parks grandCanyon = new Parks("Grand Canyon", "National Park", 36.0636, -112.1079);
    Parks yosemite = new Parks("Yosemite", "National Park", 37.8855, -119.5360);
    
    Rivers mississippi = new Rivers("Mississippi", "National Park", 47.2160, -95.2348, 35.1556, -90.0659, 29.1566, -89.2495,3);
    Rivers missouri = new Rivers("Missouri", "River", 45.9239, -11.4983, 38.8146, -90.1218,2);
    Rivers colorado = new Rivers("Colorado", "River", 40.4708, -105.8286, 36.1015, -112.0892, 34.2964, -114.1148, 31.7811, -114.7724,4);
    Rivers delaware = new Rivers("Delaware", "River", 42.2026, -75.00836, 39.4955, -75.5592,2);

    Layer<Line> layer = new Layer<>();
    layer.addElement(mississippi);
    layer.addElement(missouri);
    layer.addElement(colorado);
    layer.addElement(delaware);

    Layer<Point> layer2  = new Layer<>();
    layer2.addElement(yosemite);
    layer2.addElement(grandCanyon);
    layer2.addElement(yellowstone);

    layer.renderLayer();
    layer2.renderLayer();
  }

}
