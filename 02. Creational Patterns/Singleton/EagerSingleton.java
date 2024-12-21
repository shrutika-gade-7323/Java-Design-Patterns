package Singleton;

public class EagerSingleton {
    // When the class is loaded in the JVM itself, at that time the object will be created.
    // JVM will ensure that whenever any thread is trying to access the object, that object will be created first.
    // Resource Wastage Problem arises as even if we do not need the object, it will be created.    
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {}

    public static EagerSingleton getInstance() {
        return instance;
    }
}