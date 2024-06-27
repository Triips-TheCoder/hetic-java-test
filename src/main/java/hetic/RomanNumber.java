package hetic;

public class RomanNumber {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static String transform(Integer number) {
        return switch (number) {
            case 1 -> "I";
            case 2 -> "II";
            case 3 -> "III";
            case 4 -> "IV";
            case 5 -> "V";
            default -> "I";
        };
    }
}
