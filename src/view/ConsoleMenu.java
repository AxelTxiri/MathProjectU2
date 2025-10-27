package view;
import java.util.Scanner;

public class ConsoleMenu {
    public static void showMenu() {
        int option = 0;
        Scanner scanner = new Scanner(System.in);

        while (option != 3) {
            System.out.println("********************************");
            System.out.println("*      Math Project Menu       *");
            System.out.println("********************************");
            System.out.println("*   1. First Grade Ecuations   *");
            System.out.println("*   2. Second Grade Ecuations  *");
            System.out.println("*   3. Exit                    *");
            System.out.println("********************************");
            System.out.print("Select an option: ");
            option = scanner.nextInt();
            System.out.println();

            switch (option) {
                case 1:
                    System.out.println("You selected First Grade Ecuations.");
                    // Call method to handle first grade equations
                    break;
                case 2:
                    System.out.println("You selected Second Grade Ecuations.");
                    // Call method to handle second grade equations
                    break;
                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
            System.out.println();
        }
    }
}
