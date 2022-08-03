public class StringsMethod {
    public static void main(String[] args) {
        String name = "Amit Srivastava";
        int arr[] = { 10, 2, 030, 40, 50, 60, 70, 80, 90, 100 };
        char a[] = { 'A', 'B' };
        // length function
        System.out.println(arr.length);
        System.out.println(name.length());
        // String convert into character array
        char w[] = name.toCharArray();
        byte w1[] = name.getBytes();// isse hamare pass convert string into byte ye generally data structure ki
                                    // complex poblem ko solve karne mei used atta hai
        // Agar mujhe string mei kuch dundhna ho to
        System.out.println(name.indexOf("m"));// it is given me index or -1 if not find
        // we can also used this method as well matlab last index ko find karna
        System.out.println(name.lastIndexOf("a"));
        // hun aise bhi dundh sakte hai by using contain function
        System.out.println(name.contains("m")); // it give only boolean vale true or false
        // Suppose mere pass bahut saare unwanted spaces hai
        name = "     Amit     Srivastava        ".trim();// we remove spacse
        // Agar mei staring spacse known as --leading spaces or last space known as
        // trilling but mieddle walo ke liye koi bhi function nahi hota

        // Split the message
        String msg = "Hello how are you";
        // hum chahate hai isko split kare orkisi array mei daal de, so we simply do
        // ek or cheez ye split hamesha array mei hi return deta hai humko
        String e[] = msg.split(" ");
        for (String t : e) {
            System.out.println(t);
        }
        // hum isi split method ko charactyer by character bhi used karke aa sakte hai
        String msg1 = "Hello java kaise ho ";
        String e1[] = msg1.split("");
        for (String t1 : e1) {
            System.out.print(t1 + ", ");
        }
        // A very important method matlab agar hume kisi string mei se sub part of
        // string nikalna hai to
        System.out.println();
        System.out.println("Amit".substring(1));// it give mit as output
        System.out.println("Amit".substring(1, 2));// it give m as output [2-1]
        // one more method ki hume ye pata laga na hai ki string start ho rahi hai kisi
        // particular character se
        System.out.println("Amit@gmail.com".startsWith("Amit"));// agar ho rahi hogi to true dega varna false dega
        // isi ka opposite
        System.out.println("Amit@gamil.com".endsWith(".com"));// agar ho rahi hogi to true dega varna false dega
        // one more method
        System.out.println("RAM".equals("ram"));// it give false
        // but agar mujhe capital se koi lena dena nahi hai so we do
        System.out.println("RAM".equalsIgnoreCase("ram"));// this time it will give true
        // Another function--compareto
        System.out.println("Ram".compareTo("Amit"));// this ram ye batayega ki amit choti string ram ke compare or ye
                                                    // positive value dega
        // isi ka opposite
        System.out.println("Amit".compareTo("Ram")); // this time it will give negative value
        // or agar same ho string
        System.out.println("Ram".compareTo("Ram"));// it will give 0

        // agar mere ko single character nikalna hai to
        System.out.println("Amit".charAt(0));
    }
}
