package task4;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class CustomClass {
    private int value;
    private String name;

    public CustomClass() {
        this.value = 0;
        this.name= "Default";
    }

    public CustomClass(int value) {
        this.value = value;
    }

    public CustomClass(int value, String name) {
        this.value = value;
        this.name = name;
    }

    @Override
    public String toString() {
        return "CustomClass{"  +
                "value=" + value +
                ", name='" + name + '\'' +
                '}';
    }
}

