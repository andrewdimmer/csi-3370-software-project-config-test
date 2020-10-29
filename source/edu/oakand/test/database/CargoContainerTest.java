package edu.oakland.test.database;

import static org.junit.jupiter.api.Assertions.assertEquals;

import edu.oakland.helper.database.CargoContainer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("CargoContainer Test")
public class CargoContainerTest {

  private String[] colors = {"blue", "green", "red", "purple", "atm"};
  private String[] locations = {"Oakland University", "Location 2"};
  private String[] items = {"ATM machine", "Fork", "Smaller cargo container"};
  private int randInt = (int)(Math.random() * (10000 - 0 + 1) + 0);
  private String color = colors[(new Random()).nextInt(colors.length)];
  private String location = locations[(new Random()).nextInt(locations.length)];
  private String item = items[(new Random()).nextInt(items.length)];

  @Test
  @DisplayName("Test storing of color")
  void colorsEqual() {
    CargoContainer cargo = new CargoContainer(color, location, item, randInt);
    assertEquals(cargo.returnColor(), color);
  }

  @Test
  @DisplayName("Test storing of location")
  void locationsEqual() {
    CargoContainer cargo = new CargoContainer(color, location, item, randInt);
    assertEquals(cargo.returnlocation(), location);
  }

  @Test
  @DisplayName("Test storing of item")
  void coordzEqual() {
    CargoContainer cargo = new CargoContainer(color, location, item, randInt);
    assertEquals(cargo.getContent(), item);
  }

  @Test
  @DisplayName("Test storing of ID")
  void coordzEqual() {
    CargoContainer cargo = new CargoContainer(color, location, item, randInt);
    assertEquals(cargo.returnID(), randInt);
  }
}