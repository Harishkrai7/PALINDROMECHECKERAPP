import java.util.Scanner;

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

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String uinput = scanner.nextLine();

        String reversed = "";

        for (int i = uinput.length() - 1; i >= 0; i--) {
            reversed = reversed + uinput.charAt(i);
        }

        if (input.equals(reversed)) {
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }


    }
}

String input = "madam";  // you can change the string

// Convert string to char array
char[] chars = input.toCharArray();

int start = 0;
int end = chars.length - 1;

boolean isPalindrome = true;

// Two-pointer comparison
while (start < end) {
        if (chars[start] != chars[end]) {
isPalindrome = false;
        break;
        }
start++;
end--;
        }

// Display result
        if (isPalindrome) {
        System.out.println(input + " is a Palindrome");
} else {
        System.out.println(input + " is NOT a Palindrome");
}

String input = "noon";
Stack<Character> stack = new Stack<>();

for (char c : input.toCharArray()) {
        stack.push(c);
}

boolean isPalindrome = true;

for (char c : input.toCharArray()) {
        if (c != stack.pop()) {
isPalindrome = false;
        break;
        }
        }

        if (isPalindrome) {
        System.out.println(input + " is a Palindrome");
} else {
        System.out.println(input + " is NOT a Palindrome");
}

String input = "madam";

Queue<Character> queue = new LinkedList<>();
Stack<Character> stack = new Stack<>();

for (char c : input.toCharArray()) {
        queue.add(c);
    stack.push(c);
}

boolean isPalindrome = true;

while (!queue.isEmpty()) {
        if (!queue.remove().equals(stack.pop())) {
isPalindrome = false;
        break;
        }
        }

        if (isPalindrome) {
        System.out.println(input + " is a Palindrome");
} else {
        System.out.println(input + " is NOT a Palindrome");
}