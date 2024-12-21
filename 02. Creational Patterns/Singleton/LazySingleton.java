package Singleton;

/**
 * Multithreading Approach is not handled here.
 * Both the threads are getting a new instance of the singleton class.
 * This violates the principle of the Singleton Design Pattern.
 **/

import java.io.*;

public class LazySingleton implements Serializable {
    private static LazySingleton instance = null; // Static Instance of the same class.

    private LazySingleton() {} // Private Constructor: No one will be able to create the object of this class.

    // Static Method that will instantiate the object and will return the same object everytime.
    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
