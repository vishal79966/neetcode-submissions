class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length;
        int c = matrix[0].length;
        int l = 0;
        int h = c-1;
        while(l<r && h>=0){
            if(matrix[l][h]==target){
                return true;
            }else if(matrix[l][h]<target){
               l++;
            }else{
                h--;
            }
        }
        return false;
    }
}
