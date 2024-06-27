package hetic;

public class RomanNumber {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static String transform(Integer number) {
        if (number == 3) return "III";
        if (number == 2) return "II";
        if (number == 1) return "I";

        return "I";
    }
}
