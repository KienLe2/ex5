public class TwoDimenArray {
    public static void main(String[] args) {
        int matrix[][] = new int[10][10];
        int sum = 0;
        int min = 0, max = 0, minLeft = 0, maxLeft = 0, maxRight = 0, minRight = 0;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                if(i == j){
                    matrix[i][j] = i;
                    sum += matrix[i][j];
                }
                else {
                    matrix[i][j] = 0;
                }
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println(" >>>> ");
    }
}
