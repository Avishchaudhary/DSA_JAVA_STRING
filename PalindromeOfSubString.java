public class PalindromeOfSubString {
    static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i <= j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "abccbc";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String temp = str.substring(i, j);
                // calling a function
                if (isPalindrome(temp)) { // agar true hai condition
                    System.out.println("Palindrome " + temp);
                }
                // pehle hum in sab possibility ko hi print karle
                // System.out.print(temp + " ");
            }
        }

    }
}
