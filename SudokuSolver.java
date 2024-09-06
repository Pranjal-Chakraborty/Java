import java.util.Scanner;

public class SudokuSolver {

    public static boolean isSafe(int sudoku[][], int row, int col, int digit){
        
        //Column check
        for(int i = 0; i < 9; i++){
            if(sudoku [i][col] == digit){
                return false;
            }
        }
        
        //Row check
        for(int j = 0; j < 9; j++){
            if(sudoku [row][j] == digit){
                return false;
            }
        }
        
        //Grid check
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for(int i = sr; i < sr + 3; i++){
            for(int j = sc; j < sc + 3; j++){
                if(sudoku[i][j] == digit){
                    return false;
                }
            }
        }

        //Default case
        return true;
    }
    
    public static boolean solve(int sudoku[][], int row, int col){
        //Base Case
        if(row == 9){
            return true;
        }
        
        //Traversing cells
        int nextRow = row, nextCol = col + 1;
        if(col + 1 == 9){
            nextRow = row + 1;
            nextCol = 0;
        }
        //Recursion
        if(sudoku[row][col] != 0){
            return solve(sudoku, nextRow, nextCol);
        }
        for(int digit = 1; digit <= 9; digit++){
            if(isSafe(sudoku, row, col, digit)){
                sudoku[row][col] = digit;
                if(solve(sudoku, nextRow, nextCol)){
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }
        return false;
    }

    public static void printSudoku(int sudoku[][]){
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int sudoku[][] = new int[9][9];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the elements of the sudoku row wise : ");
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                sudoku[i][j] = scan.nextInt();
            }
        }
        scan.close();
        
        if(solve(sudoku, 0, 0)){
            System.out.println("There is a solution for the provided sudoku and the solution is : ");
            printSudoku(sudoku);
        }
        else{
            System.out.println("There is no possible solution for the provided sudoku.");
        }
    }
}
