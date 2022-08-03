public class StringBuffer {
    public static void main(String[] args) {
        String name = "Amit";
        name = name + "Srivastava";
        // StringBuffer sb = new StringBuffer("amit");
        StringBuilder sb = new StringBuilder("amit");
        System.out.println(sb.length()); // it gives 4
        System.out.println(sb.capacity()); // 16 +4=20;
        sb.append(" hellojhgjhgykjjkadhhsuihvjksfhvuisf");
        // formula to calculate length in stringbuffer
        // New capacity = old capacity * Size of array + lastchar
        // new capacity=20 *2+2
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        // agar hume in betweenkuch add karna hai string meit to ye karo
        sb.insert(4, "ahhshh");// add at index
        // reverse the string
        sb.reverse();
        // ek delete ka bhi fuction hai
        sb.delete(1, 8);// yaani 1 se lekar 8 tak ke character ko delete kar dega
        sb.deleteCharAt(1);// only single char delete ho rha hai sirf

    }
}