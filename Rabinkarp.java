public class Rabinkarp {
    public static void main(String[] args) {
        /*
         * Important points
         * 1.slide the pattern one by one
         * 2.Do the better hash
         * 3.If hash are same then compare the character
         * 4.repeat the first step again till string exhaust
         */
        String str = "AXAYABCDAXABZZAWABAD";
        String pattern = "AB";
        int n = str.length();
        int p = pattern.length();
        int d = pattern.length(); // or we also take pattern.length(); also
        int q = 13;// anything but a prime number
        // Now create a hash for both pattern as well as string
        int stringhash = 0;
        int patternhash = 0;
        // compute the pattern hash first
        for (int i = 0; i < p; i++) {
            patternhash = (patternhash * d + (pattern.charAt(i))) % q;
            stringhash = (stringhash * d + (str.charAt(i))) % q;
        }
        for (int i = 0; i <= (n - p); i++) {
            if (patternhash == stringhash) {// compare the pattern with string values one by one
                int j;
                for (j = 0; j < p; j++) {
                    if (pattern.charAt(j) != str.charAt(i + j)) {
                        break;
                    }
                } // j loop ends(Pattern loop ends)
                if (j == p) {
                    System.out.println("Pattern found " + i);
                }
            }
            // recompute the str hash because pattern hash to hamesha same hi rahega naa
            // change to sirf string hash hoga naa

            // we check ki mera hash kabhi exhausht to nahi hora naa
            if (i < n - p) {
                // par jo upar wala string hash aaya tha naa pehle hum usko minus karde
                stringhash = stringhash - (str.charAt(i) * d);
                // Remove the Old char Hash of Slider ab new hash nikal lo
                stringhash = ((stringhash * d + str.charAt(i + p))) % q;

                // kabhi kabhi patter bahut chota find karna hoga to aise case mei stringhash
                // bahut chota ho jaayega yaani 0 to hum ek condition laga dete hai isme

                if (stringhash < 0) {
                    stringhash = stringhash + q;
                }
            }
        }
    }
}
