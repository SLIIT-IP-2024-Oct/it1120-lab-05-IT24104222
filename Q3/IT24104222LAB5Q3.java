import java.util.Scanner;

public class IT24104222LAB5Q3 {
    public static final double ROOM_CHARGE_PER_DAY = 48000.00;
    public static final double DISCOUNT_RATE_3_4_DAYS = 0.10;
    public static final double DISCOUNT_RATE_5_OR_MORE_DAYS = 0.20;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the start date (1-31): ");
        int startDate = scanner.nextInt();

        System.out.print("Enter the end date (1-31): ");
        int endDate = scanner.nextInt();

        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Dates must be between 1 and 31.");
        } else if (startDate >= endDate) {
            System.out.println("Error: Start date must be less than end date.");
        } else {
            int daysReserved = endDate - startDate;
            double totalAmount = daysReserved * ROOM_CHARGE_PER_DAY;
            double discount = 0.0;

            if (daysReserved >= 5) {
                discount = totalAmount * DISCOUNT_RATE_5_OR_MORE_DAYS;
            } else if (daysReserved >= 3) {
                discount = totalAmount * DISCOUNT_RATE_3_4_DAYS;
            }

            double finalAmount = totalAmount - discount;

            System.out.println("Number of days reserved: " + daysReserved);
            System.out.println("Total amount before discount: Rs " + totalAmount);
            System.out.println("Discount: Rs " + discount);
            System.out.println("Total amount to be paid: Rs " + finalAmount);
        }

        scanner.close();
    }
}

