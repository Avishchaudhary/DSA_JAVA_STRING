import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        int sum = 0;
        String roman = "LVIII";
        HashMap<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        int i = 0;
        while (i < roman.length()) {
            char singlechar = roman.charAt(i);
            String currentsymbol = String.valueOf(singlechar);
            int currentvalue = map.get(currentsymbol);
            int nextvalue = 0;
            if (i + 1 < roman.length()) {
                char nextchar = roman.charAt(i + 1);
                String nextsymbol = String.valueOf(nextchar);
                nextvalue = map.get(nextsymbol);
            }
            if (currentvalue < nextvalue) {
                sum = sum + (nextvalue - currentvalue);
                i = i + 2;
            } else {
                sum = sum + currentvalue;
                i = i + 1;
            }
        }
        System.out.println(sum);
    }
}
