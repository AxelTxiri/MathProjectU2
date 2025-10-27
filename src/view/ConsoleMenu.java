package view;
import java.util.Scanner;

import model.LinearSolver;
import model.CuadraticSolver;

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
                    System.out.println();
                    System.out.println("You need to enter the equation in the form ax + b = c:");

                    System.out.println("Enter the equation:");
                    scanner.nextLine();
                    String equation = scanner.nextLine();
                    System.out.println();

                    LinearSolver linearSolver = new LinearSolver();
                    linearSolver.solveLinearEquation(equation);
                    break;
                case 2:
                    System.out.println("You selected Second Grade Ecuations.");
                    System.out.println();
                    System.out.println("You need to enter the coefficients a, b, and c for the equation ax^2 + bx + c = 0:");

                    System.out.println("Enter coefficient a:");
                    int a = scanner.nextInt();
                    System.out.println("Enter coefficient b:");
                    int b = scanner.nextInt();
                    System.out.println("Enter coefficient c:");
                    int c = scanner.nextInt();
                    System.out.println();

                    CuadraticSolver cuadraticSolver = new CuadraticSolver();
                    cuadraticSolver.solveQuadraticEquation(a, b, c);
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
