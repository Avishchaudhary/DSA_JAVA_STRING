public class Intro {
    public static void main(String[] args) {
        String name1 = "Amit";
        String name2 = new String("Amit").intern();
        System.out.println(name1 == name2);
    }
}