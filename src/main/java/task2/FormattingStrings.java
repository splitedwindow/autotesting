package task2;

public class FormattingStrings {
    public static void main(String[] args) {
        System.out.println(new FormattingStrings().raiseSalary("John", 9000, 1000));
    }

    public String format(String name, float salary) {
        return name + "'s" + " salary is " + salary;
    }

    public String raiseSalary(String name, float salary, float delta) {
        return name + "'s" + " salary is " + (salary + delta);
    }

    public String fire(String name) {
        return name + " is fired";
    }
}


//Formatting Strings
//Objective: To understand and use string formatting in Java.
//Instructions:
//Declare and initialize a String variable with a name and a float variable with a salary.
//Use the String.format method to format the string to display the name and salary in a sentence.
//Print the result to the console.
