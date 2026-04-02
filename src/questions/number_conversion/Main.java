import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter conversion type: ");
        System.out.println("1. Decimal to Binary");
        System.out.println("2. Binary to Decimal");

        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Enter a decimal number: ");
                int decimal = sc.nextInt();
                String binary = DecimalToBinary.decimaltobinary(decimal);
                System.out.println("Binary representation: " + binary);
                break;

            case 2:
                System.out.println("Enter a binary number: ");
                int binaryNum = sc.nextInt();
                int decimalNum = BinaryToDecimal.binarytodecimal(binaryNum);
                System.out.println("Decimal representation: " + decimalNum);
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}
