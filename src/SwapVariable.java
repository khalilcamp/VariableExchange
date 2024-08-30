import java.util.Scanner;

public class SwapVariable {

    public static void main(String[] args) {
        System.out.println("X value and Y value:");

        int xValue = getInput("x");
        int yValue = getInput("y");

        System.out.println("Before: x = " + xValue + ", y = " + yValue);

        int[] swappedValues = SwapVariable(xValue, yValue);

        System.out.println("After: x = " + swappedValues[0] + ", y = " + swappedValues[1]);
    }

    private static int getInput(String variableName) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value " + variableName + ": ");
        return scanner.nextInt();
    }

    private static int[] SwapVariable(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;

        return new int[]{a, b};
    }
}
