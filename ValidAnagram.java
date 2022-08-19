import java.util.*;

//19/08/2022
public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            int a = !sMap.containsKey(s.charAt(i)) ? 0 : sMap.get(s.charAt(i));
            sMap.put(s.charAt(i), ++a);
            int b = !tMap.containsKey(t.charAt(i)) ? 0 : tMap.get(t.charAt(i));
            tMap.put(t.charAt(i), ++b);
        }
        if (sMap.equals(tMap)) {
            return true;
        }
        return false;
    }

    public static boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] sCounter = new int[26];
        int[] tCounter = new int[26];
        for (int i = 0; i < s.length(); i++) {
            sCounter[s.charAt(i) - 'a']++;
            tCounter[t.charAt(i) - 'a']++;
        }
        for (int i = 0; i < tCounter.length; i++) {
            if (sCounter[i] == tCounter[i]) {
                return true;
            }
        }
        return false;
    }

    public static boolean isAnagram3(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] table = new int[26];
        for (int i = 0; i < s.length(); i++) {
            table[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            table[t.charAt(i) - 'a']--;
            if (table[t.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s, t));
        System.out.println(isAnagram2(s, t));
        System.out.println(isAnagram3(s, t));
    }
}
