package string;


import java.util.*;

public class FindAllAnagrams {

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (p.length() > s.length()) {
            return result;
        }
        int[] freq = new int[26];

        for (int i = 0; i< p.length(); i++) {
            freq[p.charAt(i) - 'a']++;
            freq[s.charAt(i)- 'a']--;
        }
        if (isZero(freq)) {
            result.add(0);
        }
        for (int i = p.length(); i < s.length(); i++) {
            freq[s.charAt(i) -'a']--;
            freq[s.charAt(i- p.length()) - 'a']++;

            if (isZero(freq)) {
                result.add(i - p.length() + 1);
            }
        }
        return result;
    }
    public static boolean isZero(int[] freq) {
        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";

        System.out.println(findAnagrams(s, p));
    }
}
