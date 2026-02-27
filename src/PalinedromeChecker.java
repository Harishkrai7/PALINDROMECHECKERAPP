public class PalinedromeChecker {


    public static void main(String[] args) {


        System.out.println("=======================================");
        System.out.println("     Welcome to Palindrome Checker     ");
        System.out.println("=======================================");

        System.out.println("Application Name : Palindrome Checker App");
        System.out.println("Version          : 1.0");

        System.out.println("---------------------------------------");
        System.out.println("System initialized successfully.");
        System.out.println("Ready for next use case...");
        System.out.println("---------------------------------------");
    }
}

public class PalinedromeChecker {

    public static void main(String[] args) {

        String input = "madam";
        boolean isPalindrome = true;

        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }
    }
}