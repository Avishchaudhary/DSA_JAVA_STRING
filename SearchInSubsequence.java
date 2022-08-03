public class SearchInSubsequence {

    public static void main(String[] args) {
        String str = "abcd";
        String search = "bda";
        int len = str.length();
        int j = 0;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == search.charAt(j)) {
                j++;
            }
        }
        System.out.println(j == search.length() ? "Pattern found" : "Pattern not found");
    }
}
