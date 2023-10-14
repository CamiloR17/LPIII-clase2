package src.singleton;

import java.util.ArrayList;
import java.util.List;

public class Singleton {

    private static Singleton instance;
    private List<String> strings = new ArrayList<>();

    private Singleton() {}

    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

    public List<String> getStrings() {
        return strings;
    }
}
