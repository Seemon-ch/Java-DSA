package string;

public class PermutationInString {
    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        int[] freq =new int[26];

        for (int i =0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
            freq[s2.charAt(i) - 'a']--;
        }
        if (isZero(freq)) {
            return true;
        }
        for (int i =s1.length(); i < s2.length(); i++) {
            freq[s2.charAt(i) -'a']--;
            freq[s2.charAt(i- s1.length()) - 'a']++;
            if (isZero(freq)) {
                return true;
            }
        }
        return false;
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
        String s1 = "ab";
        String s2 = "eidbaooo";

        System.out.println(checkInclusion(s1, s2));
    }
}
