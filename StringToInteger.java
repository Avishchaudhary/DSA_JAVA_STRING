public class StringToInteger {
    public static void main(String[] args) {
        String s = "42";
        int n = s.length();
        int sign = 1;// for positive sign ke liye
        int index = 0;
        int r = 0;
        // skip the starting spaces
        // e.g " 987"
        while (index < n && s.charAt(index) == ' ') {
            index++;
        }
        // identify the sign (+/-) // +987 or -987
        if (index < n && s.charAt(index) == '+') {
            sign = 1;
            index++;
        } else if (index < n && s.charAt(index) == '-') {
            sign = -1;
            index++;
        }
        // pick ony digit , stop when character found
        while (index < n && Character.isDigit(s.charAt(index))) {
            int digit = s.charAt(index) - '0';

            if (r > Integer.MAX_VALUE / 10 || (r == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                System.out.println(sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE);
            }

            r = 10 * r + digit;
            index++; // move to the next digit
        }
        System.out.println(sign * r);
    }
}
