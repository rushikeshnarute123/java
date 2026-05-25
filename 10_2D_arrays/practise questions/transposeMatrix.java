
public class transposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {10,20,30},
            {40,50,60}
        };

        int[][] array = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                array[j][i]  = matrix[i][j];
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
