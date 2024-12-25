import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentListExample {

//    public static void main(String[] args) {
//        // Shared CopyOnWriteArrayList
//        CopyOnWriteArrayList<Integer> sharedList = new CopyOnWriteArrayList<>();
//
//        // Writer thread: Adds numbers to the list
//        Thread writerThread = new Thread(() -> {
//            for (int i = 1; i <= 10; i++) {
//                sharedList.add(i);
//                System.out.println("Added: " + i);
//                try {
//                    Thread.sleep(100); // Simulate delay
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//
//        // Reader thread 1: Reads the list
//        Thread readerThread1 = new Thread(() -> {
//            for (int i = 0; i < 10; i++) {
//                System.out.println("Reader 1: " + sharedList);
//                try {
//                    Thread.sleep(150); // Simulate delay
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//
//        // Reader thread 2: Reads the list
//        Thread readerThread2 = new Thread(() -> {
//            for (int i = 0; i < 10; i++) {
//                System.out.println("Reader 2: " + sharedList);
//                try {
//                    Thread.sleep(200); // Simulate delay
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//
//        // Start all threads
//        writerThread.start();
//        readerThread1.start();
//        readerThread2.start();
//
//        // Wait for threads to complete
//        try {
//            writerThread.join();
//            readerThread1.join();
//            readerThread2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("Final List: " + sharedList);
//    }
}
