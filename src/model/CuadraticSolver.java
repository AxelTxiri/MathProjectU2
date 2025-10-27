package model;

public class CuadraticSolver {

    public void solveQuadraticEquation(int a, int b, int c) {
        double solution1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        double solution2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);

        if (Double.isNaN(solution1) || Double.isNaN(solution2)) {
            System.out.println("The equation has no real solutions.");
        } else if (Double.isNaN(solution1)) {
            System.out.println("The solution X1 is not a real number.");
            System.out.println("The solution X2 is: " + solution2);
        } else if (Double.isNaN(solution2)) {
            System.out.println("The solution X1 is: " + solution1);
            System.out.println("The solution X2 is not a real number.");
        } else {
            System.out.println("The solutions are:");
            System.out.println("X1 = " + solution1);
            System.out.println("X2 = " + solution2);
        }

    }
    
}
