package SingletonPattern;


/**
 * Best way to implement Singleton is using enum. In MultiThreading env
 * only once instance of enum exist in Head at runtime. So we can get
 */
public enum MySingleton {
    INSTANCE;

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
