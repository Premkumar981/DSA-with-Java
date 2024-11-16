class Solution {
    public int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int colmn = matrix[0].length;

        int[][] ans = new int[colmn][row];

        for(int i=0;i<row;i++){
            for(int j=0;j<colmn;j++){
                ans[j][i] = matrix[i][j];
            }
        }

        return ans;
    }
}
//premkumarsuru
