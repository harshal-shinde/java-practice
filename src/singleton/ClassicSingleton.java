package singleton;

public class ClassicSingleton {
    private  static ClassicSingleton obj;

    //private constructor to force use of
    //getInstance to create Singleton object

    private ClassicSingleton() {

    }

    public static ClassicSingleton getInstance() {

        if(obj==null) {
            obj= new ClassicSingleton();
        }
        return obj;
    }
}
