import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
    public static void main(String[] args) {
        String str[] = { "eat", "tea", "tan", "ate", "nat", "bat" };
        HashMap<String, List<String>> map = new HashMap<>();
        if (str.length == 0) {
            System.out.println(new ArrayList());
        }
        // do traversing by using enhanced for loop
        for (String s : str) {
            char arr[] = s.toCharArray();
            Arrays.sort(arr);
            String key = String.valueOf(arr); // char array convert into string
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList());
            }
            map.get(key).add(s);
        }
        System.out.println(map.values());
    }
}
