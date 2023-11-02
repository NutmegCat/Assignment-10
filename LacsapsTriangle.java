// Aaron Prince Anu

public class LacsapsTriangle {
    public static void main(String[] args) {

        int n = In.getInt();

        if (n < 1) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int[][] triangle = new int[n][];

        for (int i = 0; i < n; i++) {
            triangle[i] = new int[i + 1];
            triangle[i][0] = i + 1;

            if (i > 0) {
                triangle[i][i] = i + 1;

                for (int j = 1; j < i; j++) {
                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
                }
            }
        }
        System.out.println("Lacsap's Triangle with " + n + " rows:");
        printEquilateralLacsapsTriangle(triangle);
    }

    public static void printEquilateralLacsapsTriangle(int[][] triangle) {

        int maxWidth = triangle[triangle.length - 1].length * 2 - 1;

        for (int i = 0; i < triangle.length; i++) {
            int padding = (maxWidth - (triangle[i].length * 2 - 1)) / 2;

            for (int p = 0; p < padding; p++) {
                System.out.print("  ");
            }

            for (int j = 0; j < triangle[i].length; j++) {
                System.out.print(triangle[i][j]);

                if (j < triangle[i].length - 1) {
                    System.out.print("   "); // Adjust the space between numbers for alignment
                }
            }
            System.out.println();
        }
    }
}