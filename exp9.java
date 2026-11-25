// Shared Buffer Class
class Buffer {
    int data;
    boolean flag = false;

    // synchronized put() method
    synchronized void put(int n) throws InterruptedException {

        // wait() when buffer already contains a value
        while (flag)
            wait();

        data = n;
        System.out.println("Produced: " + data);

        flag = true;

        // notify() the waiting consumer
        notify();
    }

    // synchronized get() method
    synchronized void get() throws InterruptedException {

        // wait() when buffer is empty
        while (!flag)
            wait();

        System.out.println("Consumed: " + data);

        flag = false;

        // notify() the waiting producer
        notify();
    }
}

// Producer Thread
class Producer extends Thread {
    Buffer b;

    Producer(Buffer b) {
        this.b = b;
    }

    public void run() {
        int i = 1;
        try {
            while (true)
                b.put(i++);
        } catch (InterruptedException e) {}
    }
}

// Consumer Thread
class Consumer extends Thread {
    Buffer b;

    Consumer(Buffer b) {
        this.b = b;
    }

    public void run() {
        try {
            while (true)
                b.get();
        } catch (InterruptedException e) {}
    }
}

// Main Class
class exp9 {
    public static void main(String[] args) {

        // Shared object
        Buffer b = new Buffer();

        // Creating and starting two threads
        new Producer(b).start();
        new Consumer(b).start();
    }
}