public class NaiveBayesOptimised {
    public static void main(String[] args) {
        String str = "ABCABCABDABE";
        String pattern = "ABC";
        int n = str.length();
        int p = pattern.length();
        for (int i = 0; i <= (n - p);) {
            int j;
            for (j = 0; j < p; j++) {
                if (pattern.charAt(j) != str.charAt(i + j)) { // ye humne isliye kiya kyoki i tabhi increment hoga jab j
                                                              // pura chal chuk hoga
                    break; // if patern not match than exist
                }
            } // jth loop is ends
            if (j == p) { // iska matlab haiu mi mera pattern match ho gaya hoga
                System.out.println("Patttern is found " + i);
            }
            if (j == 0) {
                i++; // str move to the next character
            } else {
                i = i + j; // jump to the jth index from where pattern not match
            }
        }
    }
}
