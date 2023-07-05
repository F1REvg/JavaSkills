package comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Zhenya");
        list.add("Dima");
        list.add("Lera");
        list.add("Lena");
        System.out.println("Before sort: " + list);
        Collections.sort(list);
        System.out.println("After sort: " + list);
    }
}
