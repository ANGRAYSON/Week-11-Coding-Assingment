package application_main_methods;

import java.util.stream.Collectors;
import entity.Cookies;

public class ProblemTwo {

  public static void main(String[] args) {
    //2. Create a new class with a main method. Using the list of objects you created
    //   in the prior problem - 
    
    //a. Create a Stream from the list of objects.
    //b. Turn the Stream of object into Stream of String(use the map method for this).
    //c. Sort the stream in the natural order
    //d. Collect the Stream and return a comma-separated list of names as a single String    
    String cookieStream = Cookies.cookieList.stream().map(Cookie -> Cookie.toString())
        .sorted().collect(Collectors.joining(", "));
    
    //e. Print the resulting String.
    System.out.println(cookieStream);

  }

}
