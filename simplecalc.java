import java.util.Scanner;
public class simplecalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("________________________________");
        System.out.println("|                              |");
        System.out.println("| Welcome to Simple Calculator |");
        System.out.println("|______________________________|");
        System.out.println("");
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("________________________________");
        System.out.println("");
        System.out.println("Choose an Operation: 1. Addition 2. Subtraction 3. Multiplication 4. Division");
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                System.out.println("Result: " + (num1 + num2));
                break;
                case 2:
                System.out.println("Result: " + (num1 - num2));
                break;
                case 3:
                System.out.println("Result: " + (num1 * num2));
                break;
                case 4:
                System.out.println("Result: " + (num1 / num2));
                break;
                default:
                System.out.println("Invalid choice. Please select a valid operation.");
        }
        scanner.close();
    }
    
}
