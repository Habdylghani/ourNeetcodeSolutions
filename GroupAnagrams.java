import java.util.List;
import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] s = strs[i].toCharArray();
            Arrays.sort(s);
            if (!map.containsKey(Arrays.toString(s))) {
                map.put(Arrays.toString(s), new ArrayList<String>());
            }
            map.get(Arrays.toString(s)).add(strs[i]);
        }
        List<List<String>> values = new ArrayList<List<String>>();
        for (List<String> strList : map.values()) {
            values.add(strList);
        }
        return values;
    }

    public static void main(String[] args) {
        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
        System.out.println(groupAnagrams(strs));
    }
}
