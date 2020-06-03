public class ArrayOperations {
    /*
    filling 3x3 matrix with negative values to keep track of the 
    buttons pressed by player. This negative values will be
    filled later with 1's and 2's.
    */
    public static void ArrayFill(int[][] arr, int rows, int columns){
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                arr[i][j] = -99;
            }
        }
    }
}