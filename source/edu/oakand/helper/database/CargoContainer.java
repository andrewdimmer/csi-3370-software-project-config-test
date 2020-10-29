package edu.oakland.helper.database;

public class CargoContainer {

  private String color;
  private String location;
  private String content;
  private int containerID;

/**
* Main cargo container class. Used for testing uploading and using pull requests.
* @author Database Team
* @version 1.0
*/
  public CargoContainer(String color, String location, String content, int containerID) {
    this.color = color;
    this.location = location;
    this.content = content;
    this.containerID = containerID;
  }

  public String returnColor() {
    return color;
  }
    
  public String returnLocation() {
    return location;
  }

  public String getContent() {
    return content;
  }

  public String isContainer() {
    return "Yes.";
  }

  public int returnID(){
    return containerID;
  }

  public String returnProperties(){
    return "Color: "+color+" Location: "+location+" containerID: "+String.valueOf(containerID);
  }
  
}
