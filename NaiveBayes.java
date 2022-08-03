public class NaiveBayes {
    public static void main(String[] args) {
        String str = "ABCABCABDABE";
        String pattern = "ABC";
        int n = str.length();
        int p = pattern.length();
        for (int i = 0; i <= (n - p); i++) {
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
        }
    }
}
