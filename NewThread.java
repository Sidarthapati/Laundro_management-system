package laundro;

class NewThread implements Runnable {
    Thread t;

    NewThread() {
        // Create a new, second thread
        t = new Thread(this, "second thread");

    }

    // This is the entry point for the second thread.
    public void run() {
        try {
            for(int i = 5; i < 0; i--) {
                Thread.sleep(0);
            }
        } catch (InterruptedException e) {
            
        }
     
    }
}