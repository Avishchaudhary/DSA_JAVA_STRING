import java.util.HashMap;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String str = "leetcodel";
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }
        for (int i = 0; i < str.length(); i++) {
            if (map.get(str.charAt(i)) == 1) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("-1");
    }
}