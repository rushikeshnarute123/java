public class diagonalSum {
    public static void printSum(int matrix[][]){
        // int PD=0;
        // int SD=0;

        // for (int i = 0; i < matrix.length; i++) {
        //     for (int j = 0; j < matrix[0].length; j++) {
        //         if(i==j){
        //             PD += matrix[i][j];
        //         }

        //         else if (i+j == matrix.length-1){
        //             SD += matrix[i][j];
        //         }
        //     }
        // }

        // System.out.println(PD+SD);

        int sum=0;
        for (int i = 0; i < matrix.length; i++) {
            // PD
            sum += matrix[i][i];

            // SD
            if(i != matrix.length-i-1){
                sum += matrix[i][matrix.length-i-1];
            }
        }
        System.out.println(sum);
    }
     public static void main(String[] args) {
        int matrix[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };

        printSum(matrix);
        
    }
}

