package sit.int202.register;

import java.util.*;

public class TestMap {
    public static void main(String[] main) {
        Map<Integer, List<String>> map = new HashMap(32, 0.5f);
        List<String> a1 = new ArrayList<>();
        a1.add("INT101");
        a1.add("INT102");
        a1.add("INT103");
        a1.add("INT109");
        map.put(1, a1);

        a1 = new ArrayList<>();
        a1.add("INT201");
        a1.add("INT202");
        a1.add("INT203");
        a1.add("INT209");
        map.put(2, a1);

        a1 = new ArrayList<>();
        a1.add("INT901");
        a1.add("INT902");
        a1.add("INT903");
        a1.add("INT909");
        map.put(9, a1);

        List<String> tmp = map.get(9);
        System.out.println(tmp);
        tmp.forEach(System.out::println);
        Set<Map.Entry<Integer, List<String>>> entries = map.entrySet();
        //entries.forEach(System.out::println);
        for (Map.Entry<Integer, List<String>> e : entries) {
            //System.out.println("Key: " + e.getKey() + ", Value: " + e.getValue());
            System.out.println("Semester: " + e.getKey());
            e.getValue().forEach(v -> System.out.println("\t" + v));
        }
    }
}