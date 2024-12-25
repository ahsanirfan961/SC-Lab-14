import java.util.Random;

class BankAccount {
    private int balance;

    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    // Synchronized method to deposit money
    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited: " + amount + ", New Balance: " + balance);
    }

    // Synchronized method to withdraw money
    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " attempted to withdraw: " + amount + " (Insufficient funds)");
        }
    }

    // Get the current balance
    public synchronized int getBalance() {
        return balance;
    }
}

public class BankSimulation {
    public static void main(String[] args) {
        // Create a shared bank account with an initial balance of 1000
        BankAccount account = new BankAccount(1000);

        // Runnable task for clients
        Runnable clientTask = () -> {
            Random random = new Random();
            for (int i = 0; i < 10; i++) { // Each client performs 10 transactions
                int amount = random.nextInt(500); // Random amount between 0 and 499
                if (random.nextBoolean()) {
                    account.deposit(amount);
                } else {
                    account.withdraw(amount);
                }
                try {
                    Thread.sleep(100); // Simulate transaction processing time
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        // Create and start multiple client threads
        Thread client1 = new Thread(clientTask, "Client 1");
        Thread client2 = new Thread(clientTask, "Client 2");
        Thread client3 = new Thread(clientTask, "Client 3");

        client1.start();
        client2.start();
        client3.start();

        // Wait for all threads to finish
        try {
            client1.join();
            client2.join();
            client3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final account balance
        System.out.println("Final Account Balance: " + account.getBalance());
    }
}
