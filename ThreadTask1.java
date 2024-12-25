public class ThreadTask1 {

//    public static void main(String[] args) {
//        // Thread to print numbers from 1 to 10
//        Thread numberThread = new Thread(() -> {
//            for (int i = 1; i <= 10; i++) {
//                System.out.println("Number: " + i);
//                try {
//                    Thread.sleep(500); // Pause for 500ms to simulate concurrency
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//
//        // Thread to print the squares of numbers from 1 to 10
//        Thread squareThread = new Thread(() -> {
//            for (int i = 1; i <= 10; i++) {
//                System.out.println("Square: " + (i * i));
//                try {
//                    Thread.sleep(500); // Pause for 500ms to simulate concurrency
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//
//        // Start both threads
//        numberThread.start();
//        squareThread.start();
//    }
}
