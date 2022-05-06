package sort;

import java.util.List;
import entity.Cookies;

public class CookiesSort {
  
  // g. In another class, write a method to sort the objects using a Lamnda expression
  //    using the compare method you created earlier.
  public List<Cookies> sortedListLamda(List<Cookies> cookieList){
    cookieList.sort((c1, c2) -> Cookies.compare(c1, c2));
    return cookieList;
  }
  
  // h. Write a method to sort the objects using a Method Reference to the compare method
  public List<Cookies> sortedListMethodRef(List<Cookies> cookieList){
    cookieList.sort(Cookies::compare);
    return cookieList;
  }
  
  
  
  
  
  
  
  
  
  

}
