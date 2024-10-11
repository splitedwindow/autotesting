package task4;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionExample {
    public static void main(String[] args) {
        try {
            Class<?> myClass = CustomClass.class;

            Constructor<?>[] constructors = myClass.getDeclaredConstructors();
            for (Constructor<?> constructor : constructors) {
                System.out.print("Constructor: " + constructor.getName() + " with parameters: ");
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                for (Class<?> param : parameterTypes) {
                    System.out.print(param.getName() + " ");
                }
                System.out.println();
            }

            Constructor<?> constructor = myClass.getDeclaredConstructor(int.class, String.class);
            CustomClass customInstance = (CustomClass) constructor.newInstance(10, "MyCustomObject");

            System.out.println("Created object: " + customInstance);

        } catch (NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
