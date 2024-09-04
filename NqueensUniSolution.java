import java.util.Scanner;

public class NqueensUniSolution {
     
    public static boolean isSafe(char board[][], int row, int col){
        
        //Vertical up check
        for(int i = row - 1; i >= 0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        //Left diagonal up check
        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i-- , j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        
        //Right diagonal up check
        for(int i = row - 1, j = col + 1; i >= 0 && j < board.length; i-- , j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        //Default case
        return true;
    } 
    
    public static boolean nQueens(char board[][], int row){
        //Base Case
        if(row == board.length){
            count ++;
            return true;
        }
        //Recursion
        for(int j = 0; j < board.length; j++){
            if(isSafe(board, row, j)){
                board [row] [j] = 'Q';
                if(nQueens(board, row + 1)){
                    return true;
                }
                board [row] [j] = '_';
            }
        }

        return false;
    }

    public static void printBoard(char board[][]){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int count = 0;
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows in the chess board : ");
        int row = scan.nextInt();
        scan.close();
        char board[][] = new char[row][row];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                board[i][j] = '_';
            }
        }
        if(nQueens(board, 0) == true){
            System.out.println("There are solutions present for the provided scenario.");
            System.out.println("One of the solution can be : ");
            printBoard(board);
        }
        else{
            System.out.println("There is no possible solution for this problem.");
        }
    }
}
