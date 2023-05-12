package assignments_Core_Java;

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("MyRunnable thread is running.");
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
    }
}

