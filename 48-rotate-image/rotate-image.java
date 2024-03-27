class Solution {
    public void rotate(int[][] matrix) {
        for(int k=0;k<matrix.length;k++){
            int i=0;
            int j=matrix.length-1;
            while(i<j){
                swap(matrix,i,k,j,k);
                i++;
                j--;
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix.length;j++){
                swap(matrix,i,j,j,i);
            }
        }
    }
    void swap(int[][] matrix,int i,int j,int k,int l){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[k][l];
        matrix[k][l] = temp;
    }
}