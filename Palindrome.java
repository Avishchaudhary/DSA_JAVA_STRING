public class Palindrome {
    public static void main(String[] args) {
        String name = "Avish";
        // two pointer approaches
        int i = 0;
        int j = name.length() - 1;
        while (i < j) {
            if (name.charAt(i) != name.charAt(j)) {
                System.out.println("Not a palindrome string");
                return;
            }
            i++;
            j--;
        }
        System.out.println("palindrome string");
    }
}