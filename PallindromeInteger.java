public class PallindromeInteger {
    public static void main(String[] args) {
        int number = 121;
        int remainder;
        int temp;
        int sum = 0;
        temp = number;
        while (number > 0) {
            remainder = number % 10;
            sum = (sum * 10) + remainder;
            number = number / 10;
        }
        if (temp == sum) {
            System.out.println("pallindrome");
        } else {
            System.out.println("Not a pallindrome");
        }
    }
}
