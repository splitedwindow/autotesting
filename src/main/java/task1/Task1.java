package task1;


public class Task1 {
    String name;
    float salary;
    public static void main(String[] args) {
        Task1 task = new Task1();
        String formatted = task.ouput("John", 50000);
        System.out.println(formatted);
    }

    public String ouput(String name, float salary) {
        this.name = name;
        this.salary = salary;

        return String.format("%s has salary of %f",
                this.name, this.salary);
    }
}



//V 11: Formatting Strings
//Objective: To understand and use string formatting in Java.
//Instructions:
//Declare and initialize a String variable with a name and a float variable with a salary.
//Use the String.format method to format the string to display the name and salary in a sentence.
//Print the result to the console.
