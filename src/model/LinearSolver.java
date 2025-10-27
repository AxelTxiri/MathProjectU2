package model;

public class LinearSolver {

    public void solveLinearEquation(String equation) {
        double solution = 0.0;
        
        equation = equation.replace(" ", "");
        String[] sides = equation.split("=");

        String leftSide = sides[0].replace("-", "+-");
        String rightSide = sides[1].replace("-", "+-");

        String[] leftTerms = leftSide.split("\\+");
        String[] rightTerms = rightSide.split("\\+");

        String LeftA = leftTerms[0].replace("x", "");
        String LeftB = leftTerms[1];

        int a = Integer.parseInt(LeftA);
        int b = Integer.parseInt(LeftB);
        int c = Integer.parseInt(rightTerms[0]);

        solution = (double)(c - b) / a;
        System.out.println("The solution is:");
        System.out.println("X = " + solution);
        System.out.println();
    }
}
