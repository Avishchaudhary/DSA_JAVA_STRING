import java.util.ArrayList;

public class SubSquenceOfAString {
    public static void main(String[] args) {
        String str = "abcd";
        ArrayList<String> subseqlist = new ArrayList<>();
        // ab mei is string ki length nikal ke rakh leta hu
        int length = str.length();
        // ab mei traverse karna suru karta hu
        for (int i = 0; i < length; i++) {
            char firstchar = str.charAt(i);
            if (subseqlist.size() == 0) {
                subseqlist.add("");// not included it
                // or ab iske baad
                subseqlist.add("" + firstchar);// included it
                // isse mera pehla case to solve ho gaya ki list mei blank or pehla character
                // yaani a to aa gaya
                // ab mere ko piche jaane ki koi need nahi hai so i will do continue
                continue;
            }
            int sublength = subseqlist.size();// ye maine loop ke inside isliye rakhi hai kyoki length baar baar
                                              // compute hogi naa

            // ab yha par hum dobara se traverse karenge
            for (int j = 0; j < sublength; j++) {
                String temp = subseqlist.get(j) + firstchar; // yha j ki value b hai kyoki a to humne upar print
                                                             // kara diya tha
                subseqlist.add(temp);
            }
            System.out.print("Sub sequence list are " + subseqlist);
        }
    }
}
