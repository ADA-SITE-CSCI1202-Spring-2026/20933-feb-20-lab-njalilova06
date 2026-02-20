import java.util.Scanner;
import java.util.Arrays;

public class Exercise2 {

    public static int MinVal(int[] arr) {
        int min = arr[0];
        for (int val : arr) {
            if (val < min) {
                min = val;
            }
        }
        return min;
    }

    public static int MaxVal(int[] arr) {
        int max = arr[0];
        for (int val : arr) {
            if (val > max) {
                max = val;
            }
        }
        return max;
    }

    public static int[] MinMaxVal(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int val : arr) {
            if (val < min) min = val;
            if (val > max) max = val;
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {

        if (args.length > 0) {
            int[] arrCmd = new int[args.length];
            for (int i = 0; i < args.length; i++) {
                arrCmd[i] = Integer.parseInt(args[i]);
            }
            System.out.println("Command Line Array: " + Arrays.toString(arrCmd));
            System.out.println("Minimum: " + MinVal(arrCmd));
            System.out.println("Maximum: " + MaxVal(arrCmd));
        } else {
            System.out.println("Not provided.");
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("The number of elements: ");
        int n = sc.nextInt();
        int[] arrScanner = new int[n];
        System.out.println("Elements:");
        for (int i = 0; i < n; i++) {
            arrScanner[i] = sc.nextInt();
        }

        System.out.println("Array: " + Arrays.toString(arrScanner));
        System.out.println("Minimum: " + MinVal(arrScanner));
        System.out.println("Maximum: " + MaxVal(arrScanner));

        int[] minMax = MinMaxVal(arrScanner);
        System.out.println("Using findMinMax method -> Minimum: " + minMax[0] + ", Maximum: " + minMax[1]);

    }
}