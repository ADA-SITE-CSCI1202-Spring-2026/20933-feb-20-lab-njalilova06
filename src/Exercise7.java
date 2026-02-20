import java.util.Scanner;

public class Exercise7 {

    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String original = sc.nextLine();

        String reversed = reverseString(original);

        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);

    }
}
