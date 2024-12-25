class SharedCounter {
    private int counter = 0;

    // Synchronized method to increment the counter
    public synchronized void increment() {
        counter++;
    }

    // Method to get the counter's value
    public int getValue() {
        return counter;
    }
}

public class ThreadSynchronizationExample {

//    public static void main(String[] args) {
//        SharedCounter sharedCounter = new SharedCounter();
//
//        // Create three threads that increment the counter
//        Thread thread1 = new Thread(() -> {
//            for (int i = 0; i < 100; i++) {
//                sharedCounter.increment();
//            }
//        });
//
//        Thread thread2 = new Thread(() -> {
//            for (int i = 0; i < 100; i++) {
//                sharedCounter.increment();
//            }
//        });
//
//        Thread thread3 = new Thread(() -> {
//            for (int i = 0; i < 100; i++) {
//                sharedCounter.increment();
//            }
//        });
//
//        // Start all threads
//        thread1.start();
//        thread2.start();
//        thread3.start();
//
//        // Wait for all threads to finish
//        try {
//            thread1.join();
//            thread2.join();
//            thread3.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        // Print the final value of the counter
//        System.out.println("Final Counter Value: " + sharedCounter.getValue());
//    }
}
