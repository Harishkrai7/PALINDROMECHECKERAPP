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

String input = "madam";

Deque<Character> deque = new ArrayDeque<>();

for (char c : input.toCharArray()) {
        deque.addLast(c);
}

boolean isPalindrome = true;

while (deque.size() > 1) {
        if (!deque.removeFirst().equals(deque.removeLast())) {
isPalindrome = false;
        break;
        }
        }

        if (isPalindrome) {
        System.out.println(input + " is a Palindrome");
} else {
        System.out.println(input + " is NOT a Palindrome");
}
static class Node {
    char data;
    Node next;

    Node(char d) {
        data = d;
    }
}

public static boolean isPalindrome(String str) {

    Node head = null, temp = null;

    // convert string to linked list
    for(char c : str.toCharArray()) {
        Node n = new Node(c);
        if(head == null) {
            head = n;
            temp = n;
        } else {
            temp.next = n;
            temp = n;
        }
    }

    Node slow = head, fast = head;

    // find middle
    while(fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }

    // reverse second half
    Node prev = null;
    while(slow != null) {
        Node next = slow.next;
        slow.next = prev;
        prev = slow;
        slow = next;
    }

    // compare halves
    while(prev != null) {
        if(head.data != prev.data) return false;
        head = head.next;
        prev = prev.next;
    }

    return true;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter string: ");
    String s = sc.nextLine();

    if(isPalindrome(s))
        System.out.println("Palindrome");
    else
        System.out.println("Not Palindrome");
}

// Recursive palindrome check
public static boolean isPalindrome(String str, int start, int end) {

    if(start >= end)
        return true;

    if(str.charAt(start) != str.charAt(end))
        return false;

    return isPalindrome(str, start + 1, end - 1);
}

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter string: ");
    String s = sc.nextLine();

    s = s.replaceAll("\\s+","").toLowerCase();

    if(isPalindrome(s, 0, s.length() - 1))
        System.out.println("Palindrome");
    else
        System.out.println("Not Palindrome");
}

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Input: ");
    String input = sc.nextLine();

    // Normalize string (remove spaces & convert to lowercase)
    String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

    boolean isPalindrome = true;

    // Compare characters from both ends
    for (int i = 0; i < normalized.length() / 2; i++) {
        if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
            isPalindrome = false;
            break;
        }
    }

    System.out.println("Is Palindrome?: " + isPalindrome);
}

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter string: ");
    String input = sc.nextLine();

    PalindromeChecker checker = new PalindromeChecker();

    boolean result = checker.checkPalindrome(input);

    System.out.println("Is Palindrome?: " + result);
}
// Strategy Interface
interface PalindromeStrategy {
    boolean check(String str);
}

// Stack based strategy
class StackStrategy implements PalindromeStrategy {

    public boolean check(String str) {

        Stack<Character> stack = new Stack<>();

        for(char c : str.toCharArray())
            stack.push(c);

        for(char c : str.toCharArray()) {
            if(c != stack.pop())
                return false;
        }

        return true;
    }
}

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter string: ");
    String input = sc.nextLine();

    input = input.replaceAll("\\s+","").toLowerCase();

    // Inject strategy
    PalindromeStrategy strategy = new StackStrategy();

    boolean result = strategy.check(input);

    System.out.println("Is Palindrome?: " + result);
}

public static boolean loopPalindrome(String str) {
    for (int i = 0; i < str.length() / 2; i++) {
        if (str.charAt(i) != str.charAt(str.length() - 1 - i))
            return false;
    }
    return true;
}

public static boolean reversePalindrome(String str) {
    String rev = new StringBuilder(str).reverse().toString();
    return str.equals(rev);
}

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter string: ");
    String input = sc.nextLine().replaceAll("\\s+","").toLowerCase();

    long start1 = System.nanoTime();
    boolean r1 = loopPalindrome(input);
    long end1 = System.nanoTime();

    long start2 = System.nanoTime();
    boolean r2 = reversePalindrome(input);
    long end2 = System.nanoTime();

    System.out.println("Loop Method: " + r1 + " Time: " + (end1 - start1) + " ns");
    System.out.println("Reverse Method: " + r2 + " Time: " + (end2 - start2) + " ns");
}

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter string: ");
    String input = sc.nextLine().replaceAll("\\s+","").toLowerCase();

    // Start time
    long start = System.nanoTime();

    boolean isPalindrome = true;

    for (int i = 0; i < input.length() / 2; i++) {
        if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
            isPalindrome = false;
            break;
        }
    }

    // End time
    long end = System.nanoTime();

    long timeTaken = end - start;

    System.out.println("Is Palindrome?: " + isPalindrome);
    System.out.println("Execution Time: " + timeTaken + " ns");
}