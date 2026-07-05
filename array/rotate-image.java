class Solution {
    public void rotate(int[][] matrix) {
        int rows = matrix.length;
        int colums  = matrix.length;
        //first transpose
        for(int i=0;i<rows;i++){
            for(int j =i+1;j<colums;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //then reverse
        for(int i = 0;i<rows;i++){
            int left = 0;
            int right = colums-1;
            while(left<right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }
}