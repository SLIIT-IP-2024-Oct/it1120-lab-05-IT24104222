import java.util.Scanner;

public class IT24104222LAB5Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first integer:");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter the second integer:");
        int secondNumber = scanner.nextInt();

        System.out.println("Enter the third integer:");
        int thirdNumber = scanner.nextInt();
  {     
     System.out.println("user entered numbers are:" +firstNumber""+secondNumber""+thirdNumber);
  }


        int smallest = firstNumber;
        int largest = firstNumber;

        if (secondNumber > largest) {
            largest = secondNumber;
        }
        if (thirdNumber > largest) {
            largest = thirdNumber;
        }

        if (secondNumber < smallest) {
            smallest = secondNumber;
        }
        if (thirdNumber < smallest) {
            smallest = thirdNumber;
        }

        System.out.println("Largest integer: " + largest);
        System.out.println("Smallest integer: " + smallest);

        scanner.close();
    }
}
