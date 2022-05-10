package lesson4hmw;

import java.util.HashMap;
import java.util.HashSet;

public class ArrayHmw {
    public void stringsArray(){
        String[] buttons = {"Sunday", "Munday", "Tuesday","Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println(buttons[0]);
        System.out.println(buttons[1]);
        System.out.println(buttons[2]);
        System.out.println(buttons[3]);
        System.out.println(buttons[4]);
        System.out.println(buttons[5]);
        System.out.println(buttons[6]);

    }
    public void hashMapHmw(){
        HashMap<String,String>hashMap = new HashMap<String, String>();
        hashMap.put("England", "London");
        hashMap.put("Germany", "Berlin");
        hashMap.put("France", "Paris");
        System.out.println(hashMap);

    }
    public void hashSetHmw(){
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("Steve");
        hashSet.add("Tim");
        hashSet.add("Lucy");

        hashSet.add("Pat");
        hashSet.add("Angela");
        hashSet.add("Tom");
        hashSet.add("Tim");
        hashSet.add("Anna");
        hashSet.add("Lucy");
        System.out.println(hashSet);

    }

}
