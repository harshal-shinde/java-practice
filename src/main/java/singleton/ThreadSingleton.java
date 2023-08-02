package singleton;

public class ThreadSingleton {
    private static ThreadSingleton obj;

    public static synchronized  ThreadSingleton getInstance() {
        if (obj==null)
            obj= new ThreadSingleton();
        return obj;
    }
}
