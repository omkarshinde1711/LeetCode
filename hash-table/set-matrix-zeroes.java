class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean isFirstColZero = false;
        for (int i = 0; i < m; i++) {
                if (matrix[i][0] == 0) {
                    isFirstColZero = true;
                }
            
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0; // Mark the row
                    matrix[0][j] = 0; // Mark the column
                }
            }
        }
            for (int i = 1; i < m; i++) {
                for(int j =1; j < n; j++) {
                        if(matrix[i][0] == 0 || matrix[0][j] == 0 ) {
                            matrix[i][j] = 0;
                        }
                    }
                }   
            // 3. Handle the first row
            if (matrix[0][0] == 0) {
                for (int j = 0; j < n; j++) {
                    matrix[0][j] = 0;
                }
            }


            // 4. Handle the first column
            if (isFirstColZero) {
                for (int i = 0; i < m; i++) {
                    matrix[i][0] = 0;
                }
            }

    }
}