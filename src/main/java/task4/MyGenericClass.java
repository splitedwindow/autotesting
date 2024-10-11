package task4;

import java.util.ArrayList;
import java.util.List;

class MyGenericClass<T> {

    public static void main(String[] args) {
        MyGenericClass<Integer> intList = new MyGenericClass<>();
        intList.addElement(10);
        intList.addElement(20);
        intList.addElement(30);

        System.out.println("Integer list:");
        intList.printElements();

        MyGenericClass<String> stringList = new MyGenericClass<>();
        stringList.addElement("Hello");
        stringList.addElement("Generic");
        stringList.addElement("Class");

        System.out.println("String list:");
        stringList.printElements();
    }

    private List<T> elements;

    public MyGenericClass() {
        elements = new ArrayList<>();
    }

    public void addElement(T element) {
        elements.add(element);
    }

    public void printElements() {
        for (T element : elements) {
            System.out.println(element);
        }
    }
}
