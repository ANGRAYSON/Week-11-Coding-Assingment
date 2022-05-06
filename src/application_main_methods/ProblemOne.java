package application_main_methods;

import entity.Cookies;
import sort.CookiesSort;

public class ProblemOne {

  public static void main(String[] args) {
    CookiesSort cookiesDao = new CookiesSort();
    
    // i. Create a main method to call the sort methods
    cookiesDao.sortedListLamda(Cookies.cookieList);
    
    cookiesDao.sortedListMethodRef(Cookies.cookieList);
    
    // j. Print the list after sorting (System.out.println).
    System.out.println(Cookies.cookieList);
    
  }

}
