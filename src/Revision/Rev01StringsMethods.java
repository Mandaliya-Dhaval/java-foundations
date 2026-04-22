public class Rev01StringsMethods {

    static String reverseWithStringBuilder(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    static int countWords(String sentence) {
        sentence = sentence.trim();
        if (sentence.isEmpty()) return 0;
        return sentence.split("\\s+").length;
    }

    static boolean isPalindromeIgnoreCaseAndSpaces(String s) {
        String cleaned = s.replaceAll("\\s+", "").toLowerCase();
        String rev = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(rev);
    }

    public static void main(String[] args) {
        String s1 = "Hello Java";
        System.out.println("Reverse: " + reverseWithStringBuilder(s1));

        String s2 = "  I   am  learning   Java  ";
        System.out.println("Word count: " + countWords(s2));

        String s3 = "Nurses Run";
        System.out.println("Palindrome ignoring spaces/case? " + isPalindromeIgnoreCaseAndSpaces(s3));
    }
}