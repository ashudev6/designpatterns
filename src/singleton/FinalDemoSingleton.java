package singleton;

import java.io.Serializable;

public class FinalDemoSingleton implements Serializable {
    private static final long serialVersionUID = 1L;

    private FinalDemoSingleton() {
        // private constructor
    }

    private static class DemoSingletonHolder {
        public static final FinalDemoSingleton INSTANCE = new FinalDemoSingleton();
    }

    public static FinalDemoSingleton getInstance() {
        return DemoSingletonHolder.INSTANCE;
    }

    protected Object readResolve() {
        return getInstance();
    }
}
