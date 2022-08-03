public class ReverseWords {
    public static void main(String[] args) {
        String str = "a good  example";
        // we want to split this string
        String a[] = str.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = a.length - 1; i >= 0; i--) {
            sb.append(a[i]).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
