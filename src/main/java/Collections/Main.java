package Collections;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(1,"Hello");
        hashMap.put(2," ");
        hashMap.put(3,"world!");
        for (Map.Entry entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: "
                    + entry.getValue());
        }

        Set<String> stringSet = new LinkedHashSet<>();
        stringSet.add("Hello");
        stringSet.add(" ");
        stringSet.add("Hello");
        for( String entry : stringSet ){
            System.out.print( entry );
        }
    }
}
