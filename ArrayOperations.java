public class ArrayOperations {
    public static void ArrayFill(int[][] arr, int rows, int columns){
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                arr[i][j] = -99;
            }
        }
    }
}