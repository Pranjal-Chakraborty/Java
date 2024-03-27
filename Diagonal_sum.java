public class Diagonal_sum {

    public static int printDSum(int matrix[][]){
        // Bruteforce Code

        // int sum = 0;
        // for(int i = 0; i < matrix.length; i++){
        //     for(int j = 0; j < matrix[0].length; j++){
        //         if( i == j){
        //             sum += matrix[i][j];
        //         }
        //         else if(i + j == matrix.length-1){
        //             sum += matrix[i][j];
        //         }
        //     }
        // }
        // return sum;

        // Optimized Code
        int len = matrix.length;
        int sum = 0;
        for(int i = 0; i < len; i++){
            sum += matrix[i][i];
            if(i != len-1-i){
                sum += matrix[i][len-1-i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        
        int arr[][] = {{0, 1, 2},
                        {3, 4, 5},
                        {6, 7, 8}
                    };
                    
        int dsum = printDSum(arr);
        System.out.println("The diagonal sum of the given matrix will be : " + dsum);
    }
}
