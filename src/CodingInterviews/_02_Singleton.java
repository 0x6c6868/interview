package CodingInterviews;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class _02_Singleton {

    private static _02_Singleton instance;

    private static Lock lock = new ReentrantLock();

    private _02_Singleton() {
    }

    public static _02_Singleton getInstance() {
        if (instance == null) {
            try {
                lock.lock();
                if (instance == null) {
                    instance = new _02_Singleton();
                }
            } finally {
                lock.unlock();
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(_02_Singleton.getInstance() == _02_Singleton.getInstance());
    }
}
