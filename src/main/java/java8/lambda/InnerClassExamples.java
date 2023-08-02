package java8.lambda;

public class InnerClassExamples {
  public static void main (String... args){
    InstanceRouter io = new InstanceRouter(12);

    //is this give compiler error
    InstanceRouter.InstanceInner ii = io.new InstanceInner();

    ii.printSomething();

    StaticOuter.StaticInner si = new StaticOuter.StaticInner();
    si.printSomething();
  }

}
