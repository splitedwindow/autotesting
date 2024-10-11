package task4;

public class Signal {

    public static void main(String[] args) {
        Signal signal = new Signal();

        Thread thread1 = new Thread(() -> {
            signal.doWait();
        }, "Thread 1");

        Thread thread2 = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
            signal.doNotify();
        }, "Thread 2");

        thread1.start();
        thread2.start();
    }
    private boolean isSignaled = false;

    public synchronized void doWait() {
        while(!isSignaled) {
            try {
                System.out.println(Thread.currentThread().getName() + " is waiting...");
                wait();
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " received the signal.");
    }

    public synchronized void doNotify() {
        isSignaled = true;
        System.out.println(Thread.currentThread().getName()+ " is sending a signal...");
        notify();
    }
}

//V11.
//a)	Create a thread that waits for a signal from another thread using wait and notify.
//b)	Create your own custom class with a few constructors, and make an object for it.
//          Use getDeclaredConstructors() to print out all the constructors of the class
//          and their parameter types. Choose a specific constructor and create a new instance
//          of the class using newInstance(). Print out your results or processing progress.
//c)	Create a generic class that can store a list of elements of any type, and add elements
//      to it using List<T> and add().