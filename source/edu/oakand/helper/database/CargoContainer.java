package edu.oakland.helper.database;

public abstract class CargoContainer {

  private String color;
  private int id; 

  public CargoContainer(String color, int id) {
    System.out.println("Creating a cargocontainer");
    this.name = name;
    this.id = address;
   }


  public abstract void listContents();
  public abstract void getContainerColor();
  public abstract void getContainerCoordinates();
  
  
  public void isThisACargoContainer() {
    System.out.println("Yes!"); 
  }

}