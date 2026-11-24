package string;


import java.util.*;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String str ="programming";
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i <str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch: map.keySet()) {
            if (map.get(ch) > 1) {
                System.out.println(ch + " : " + map.get(ch));
            }
        }
    }
}

