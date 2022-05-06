package application_main_methods;

import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Scanner;
import entity.Cookies;

public class ProblemThree {
  static Scanner input = new Scanner(System.in);

  //3. Create a new class with a main method. Create a method (method a) that
  //   accepts an Optional of some type of object(Animal, Person Camera, etc)
  
  // a.The method should return the object unwrapped from the Optional if the object is present
  //   For example, if you have an object of type Cheese, your method signature should look something like this:
  //   public Cheese cheesyMethod(Optional<Cheese> optionalCheese) {...}
  // b.The method should throw a NoSuchElementException with a custom message
  //   if the object is not present.
  public static Cookies cookieMethod(Optional<Cookies> optionalCookies) {
    return optionalCookies.orElseThrow(() -> new NoSuchElementException("Hmmm..no cookie"));
  }
  
  // c.Create another method (method b) that calls method a with an object wrapped by 
  //   an Optional. 
  //   Show that the object is returned unwrapped from the Optional (i.e., print the object).
  // d.Method b should also call method a with an empty Optional. Show that a NoSuchElementException is thrown 
  //   by method a by printing the exception message. 
  //   Hint: catch the NoSuchElementException as parameter named "e" and 
  //   do System.out.println(e.getMessage()).
  public static void findCookies(Cookies cookie) {
    // Code done with mentor
    Optional<Cookies> optional = Optional.of(Cookies.cookieList.get(0)); // 0 is chocolate chip
    try {
      System.out.println("I found a " + cookieMethod(optional) + "!");
    }catch (NoSuchElementException e) {
      System.out.println(e.getMessage());
    }
    
//   for user input: Just making sure it would work with input if I wanted it to.
    Optional<Cookies> optionalInput = null;
    if(cookie.getName().isBlank()) {
       optionalInput = Optional.empty();
    }else{
      optionalInput = Optional.of(cookie);
    }
    
    System.out.println("*From user input*");
    try {
      System.out.println("I found a " + cookieMethod(optionalInput) + "!");
    }catch (NoSuchElementException e) {
      System.out.println(e.getMessage());
    }
    
//  for controlled tests. Just in case the code I did with the mentor wasn't adequate for assignment
    System.out.println("______________________________________________");
    System.out.println("*Cookie Method with object wrapped in optional: *");
    System.out.println("I found a " + cookieMethod(Optional.of(cookie)) + "!");
    
    System.out.println("______________________________________________");
    System.out.println("*With empty optional: *");
    try {
      cookieMethod(Optional.empty());
    }catch (NoSuchElementException e) {
      System.out.println(e.getMessage());
    }
  }
  
  public static void main(String[] args) {
    System.out.println("Please enter the name of the cookie: ");
    String name = input.nextLine();
    Cookies cookie = new Cookies(name);
    findCookies(cookie);
  }

    
}
