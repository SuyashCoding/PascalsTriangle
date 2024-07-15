import java.util.Scanner;

/**
 * pascals traingle
 * @author Suyash Patel
 */
public class PascalsTriangle {

    /**
     * prints pascals triangle up to a certain height
     * @param height height of the triangle
     */
    public static void pascalsTriangle(int height) {
        for (int i = 0; i < height; i++) {
            int number = 1;
            System.out.printf("%" + (height - i) * 2 + "s", "");

            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

    /**
     * main method
     * @param args arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Height of Pascal's triangle: ");
        int height = scanner.nextInt();
        scanner.close();
        pascalsTriangle(height);
    }
}

