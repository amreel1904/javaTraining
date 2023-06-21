package day7.method;

import java.util.List;
import java.util.ArrayList;

public class method1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Amreel");
        names.add("Nuqman");
        names.add("Asmaa");
        names.add("Fatihah");
        names.remove("Fatihah");
        names.remove("Nuqman");
        for (String name : names)
            System.out.println(name);
    }
}
