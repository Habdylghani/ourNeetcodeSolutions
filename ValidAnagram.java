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

    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s, t));
    }
}
