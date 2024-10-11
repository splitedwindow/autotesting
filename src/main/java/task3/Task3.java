package task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task3 {
    public static void main(String[] args) {
        Integer[] numbers = {10, 15, 20, 25, 30};
        System.out.println(Arrays.toString(numbers));
        int start = 0;
        int end = numbers.length - 1;
        while(start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;

            start++;
            end--;
        }

        ArrayList<Integer> numbersList = new ArrayList<>();
        Collections.addAll(numbersList, numbers);

        // a)
        numbersList.add(50);

        // b)
        numbersList.remove(1);

        // c
        numbersList.set(2, 200);

        // d
        Collections.sort(numbersList);

        System.out.println(numbersList);

        try {

            System.out.println(numbers[numbers.length]);
        } catch (NullPointerException e){
            System.out.println("Caught the pointer exception: ");
        }
    }
}


//V11.
//Array Reverse: Write a Java program that takes an array of integers and reverses its elements.
// Your program should prompt the user to enter the array size and the elements of the array,
// and then output the reversed array.
//Make ArrayList from the result array and perform the following operations:
// a) Add an element to the end of the list;
// b) Remove an element from the list;
// c) Replace an element in the list;
// d) Sort the list in alphabetical order;
// e) Print the elements of the list;
//Make up the situation for NullPointerException. Catch it and display the explanation for your custom case.