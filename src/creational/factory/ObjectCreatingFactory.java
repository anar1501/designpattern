package creational.factory;


import java.lang.reflect.Constructor;

public abstract class ObjectCreatingFactory {

    public static Object getInstance(ObjectType objectType) {
        try {
            String className = objectType.getObjectClassPath();
            Class<?> productClass = Class.forName(className);
            Constructor<?> constructor = productClass.getConstructor();
            return (Object) constructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
