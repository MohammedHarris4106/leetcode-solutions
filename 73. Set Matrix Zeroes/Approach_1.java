class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
       /* boolean row=new boolean[n];
        boolean col=new boolean[m];*/
        boolean rowZero=false;//set Marker for 1st row and first column
        boolean colZero=false;
        for(int i=0;i<m;i++){//check if first Column have any zero
            if(matrix[i][0]==0){
                colZero=true;
            }
        }
        for(int j=0;j<n;j++){//same  for Row
            if(matrix[0][j]==0){
                rowZero=true;
            }
        }
        for(int i=1;i<m;i++){//if zero is present inside the matrix rather than first row and first col, we could mark the first row and column
            for(int j=1;j<n;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        for(int i=1;i<m;i++){//make zero in which marked row or column have 0
            for(int j=1;j<n;j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
            
        }
        if(colZero){//this is for the first row and column which was initially zero
            for(int i=0;i<m;i++){
                matrix[i][0]=0;
            }
        }
        if(rowZero){
            for(int j=0;j<n;j++){
                matrix[0][j]=0;
            }
        }

        return ;
      
    }
    
}
