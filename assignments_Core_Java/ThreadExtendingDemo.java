package assignments_Core_Java;

class MyThread extends Thread {
    public void run() {
        System.out.println("MyThread is running.");
    }
}

public class ThreadExtendingDemo {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}

