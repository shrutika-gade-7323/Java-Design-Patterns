package Singleton;

public class MultithreadedSingleton {
    private static MultithreadedSingleton instance;

    private MultithreadedSingleton() {}

    public static synchronized MultithreadedSingleton getInstance() {
        // Long waiting time for all the multiple threads trying to access the instance.
        if (instance == null) {
            synchronized (MultithreadedSingleton.class) { // Object is actually being created here.
                if (instance == null) {
                    instance = new MultithreadedSingleton();
                }
            }
        }
        return instance;
    }
}
