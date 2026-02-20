import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of invoices: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Invoice[] invoices = new Invoice[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for invoice " + (i + 1) + ":");

            System.out.print("Part Number: ");
            String partNumber = scanner.nextLine();

            System.out.print("Part Description: ");
            String partDescription = scanner.nextLine();

            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();

            System.out.print("Price per Item: ");
            double pricePerItem = scanner.nextDouble();
            scanner.nextLine();

            invoices[i] = new Invoice(partNumber, partDescription, quantity, pricePerItem);
        }

        System.out.println("\nInvoice Details:");
        for (Invoice inv : invoices) {
            double totalAmount = inv.getQuantity() * inv.getPricePerItem();
            System.out.println("Part Number: " + inv.getPartNumber() +
                    ", Description: " + inv.getPartDescription() +
                    ", Quantity: " + inv.getQuantity() +
                    ", Price per Item: " + inv.getPricePerItem() +
                    ", Total Amount: " + totalAmount);
        }

    }
}