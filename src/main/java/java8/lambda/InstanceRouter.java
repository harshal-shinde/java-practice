public class InstanceRouter {
  
  public InstanceRouter(int xx) {
    x = xx;
  }
  private int x;

  class InstanceInner {
    public void printSomething() {
      System.out.println("Tha value of x in my router is "+x);
    }
  }
}