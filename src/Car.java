public class Car {

    private String make;
    private String model = "ford";
    private String color;
    private int doors;
    private boolean convertible;

    // Getter methods for retrieving the values in other classes
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public String getColor(){
        return color;
    }
    public int getDoors(){
        return doors;
    }
    public boolean getConvertible(){
        return convertible;
    }

    // Setter methods to change the attributes of the objects
    public void setMake(String make){
        this.make = make;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setDoors(int doors){
        this.doors = doors;
    }
    public void setConvertible(boolean convertible){
        this.convertible = convertible;
    }

    public void describeCar(){
        System.out.println(make + " make " +
            model + " model " +
            color + " color " + 
            doors + " doors " +
            (convertible ? " convertible " : " ")
        );
    }
    
}
