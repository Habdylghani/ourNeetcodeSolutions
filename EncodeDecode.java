import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodeDecode {

    public String encodeString(String str) {
        char[] res = new char[10];
        for (int i = 0; i < str.length(); i++) {
            res[i] = (char) ((str.charAt(i) + 3) % 256);
        }
        return String.valueOf(res);
    }

    public String decodeString(String str) {
        char[] res = new char[10];
        for (int i = 0; i < str.length(); i++) {
            res[i] = (char) ((str.charAt(i) - 3) % 256);
        }
        return String.valueOf(res);
    }

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        String str = "";
        for (int i = 0; i < strs.size(); i++) {
            str += encodeString(strs.get(i));
        }
        return str;
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < s.length(); i += 10) {
            result.add(decodeString(s.substring(i, i + 10)));
        }
        return result;
    }

    // neetCode solution
    public String encode1(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();
        for (String str : strs) {
            encodedString.append(str.length()).append("#").append(str);
        }
        return encodedString.toString();
    }

    public List<String> decode1(String str) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#')
                j++;

            int length = Integer.valueOf(str.substring(i, j));
            i = j + 1 + length;
            list.add(str.substring(j + 1, i));
        }
        return list;
    }

    public static void main(String[] args) {
        List<String> s = Arrays.asList("abce", "abcde");
        EncodeDecode ed = new EncodeDecode();
        System.out.println(ed.encode1(s));
        System.out.println(ed.decode1(ed.encode1(s)));

    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(strs));
