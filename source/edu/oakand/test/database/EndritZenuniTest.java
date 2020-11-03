package edu.oakland.test.database;

import edu.oakland.helper.database.EndritZenuni;
import jdk.internal.jline.internal.TestAccessible;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("EndritZenuni Test")
public class EndritZenuniTest {
    
  private int randNum = (int) (Math.random() * 10);
  private int randNum2 = (int) (Math.random() * 10);


  @Test
  @DisplayName("Add function")
  void addEqual(){
    EndritZenuni ez = new Mathematics(randNum, randNum2);
    assertEquals(ez.add(), randNum + randNum2);
  }

  @Test
  @DisplayName("subtract function")
  void subtractEqual(){
      EndritZenuni ez = new Mathematics(randNum, randNum2);
      assertEquals(ez.add(), randNum - randNum2);
  }


}
