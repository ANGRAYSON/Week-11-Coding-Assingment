package entity;

import java.util.Arrays;
import java.util.List;

// 1. Create a class of whatever type you want(Animal, Person, Camera, etc).
// a. Do NOT implement the Comparable interface
public class Cookies {
  //b. Add a name instance variable so that you can tell the objects apart.
  private String name;
  
  //c. Add getters, setters and/or a constructor as appropriate
  public Cookies(String name) {
    this.setName(name);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  
  //d. Add a toString method that returns the name and object type (like "Pentax Camera")
  public String toString() {
    return (name + " Cookie");
  }
  
  // e. Create a static method names compare in the class that returns an int and takes 
  //    two of the objects as parameters. Return -1 if parameter 1 is "less than" parameter
  //    2. Return 1 if parameter 1 is "greater than" parameter 2. Return 0 if the two 
  //    are "equal"
  // the compareTo method from the String class accomplishes this. Checks alphabetically
  public static int compare(Cookies c1, Cookies c2) {
    return c1.getName().compareTo(c2.getName());
  }
  
//f. Create a static list of these objects, adding at least 4 objects the the list.
  public static List<Cookies> cookieList = Arrays.asList(
      new Cookies("Chocolate Chip"),
      new Cookies("Snickerdoodle"),
      new Cookies("Sugar"),
      new Cookies("Peanutbutter"),
      new Cookies("Macademia Nut"));

}
