package CodingInterviews;

public class _02_Singleton {

    private volatile static _02_Singleton instance;

    private _02_Singleton() {
    }

    public static _02_Singleton getInstance() {
        if (instance == null) {
            synchronized (_02_Singleton.class) {
                if (instance == null) {
                    instance = new _02_Singleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(_02_Singleton.getInstance());
    }
}
