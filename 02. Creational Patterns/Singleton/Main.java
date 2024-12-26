package Singleton;

import java.io.*;
import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
        exampleSerialization();
        exampleReflection();
    }

    public static void exampleSerialization() throws IOException, ClassNotFoundException {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("object01.obj"));
        objectOutputStream.writeObject(lazySingleton);
        objectOutputStream.close();
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("object01.obj"));
        LazySingleton deserializedLazy = (LazySingleton) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println("Lazy Singleton Object 01: " + lazySingleton.hashCode());
        System.out.println("Lazy Singleton Object 02: " + deserializedLazy.hashCode());

        SerializableSingleton serializableSingleton = SerializableSingleton.getInstance();
        ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new FileOutputStream("object02.obj"));
        objectOutputStream2.writeObject(serializableSingleton);
        objectOutputStream2.close();
        ObjectInputStream objectInputStream2 = new ObjectInputStream(new FileInputStream("object02.obj"));
        SerializableSingleton deserializedInstance = (SerializableSingleton) objectInputStream2.readObject();
        objectInputStream2.close();
        System.out.println("Serializable Singleton Object 01: " + serializableSingleton.hashCode());
        System.out.println("Serializable Singleton Object 02: " + deserializedInstance.hashCode());
    }
    
    private static void exampleReflection() throws InvocationTargetException, InstantiationException, IllegalAccessException {
        @SuppressWarnings("rawtypes")
        Constructor[] constructors = LazySingleton.class.getDeclaredConstructors();
        @SuppressWarnings("rawtypes")
        Constructor constructor = constructors[0];
        constructor.setAccessible(true);
        LazySingleton lazySingleton = (LazySingleton) constructor.newInstance();
        LazySingleton instance = LazySingleton.getInstance();
        System.out.println("Reflected HashCode Singleton: " + lazySingleton.hashCode());
        System.out.println("Singleton Instance: " + instance.hashCode());

        EnumSingleton.INSTANCE.doSomething();
    }
}
