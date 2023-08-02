package singleton;

public class Asingleton {

  //Create varibale private  and volatile
  private static volatile Asingleton instance;
  private static Object mutex = new Object();

  //Create private  constructor
  private Asingleton() {}

  //Create public static get Instance method
  public static Asingleton getInstance() {
    Asingleton result = instance;
    if(result == null) {
      //synchronized
      synchronized(mutex) {
        result = instance;
        if(result == null)
          instance = result = new Asingleton();
       }
    }
    return result;  
  }
}
