class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int i = 0 ;

        int maxtrixlength = matrix.length;
        //System.out.println("Length of matrix :" + maxtrixlength);
        while( i < maxtrixlength){
            
            int lastValue = matrix[i][matrix[i].length -1 ];
            //System.out.println("last Value of each row matrix :" + lastValue);

            if(target<=lastValue){
                int start = 0 ;
                int end = matrix[i].length;

                while ( start <=end ){
                    int mid = start+(end - start)/2;

                    if(target == matrix[i][mid]){
                        return true;
                    }
                    else if ( target > matrix[i][mid]){
                        start = mid+1;
                    }
                    else{
                        end = mid -1 ;
                    }


                }

            }
            i++;
        }

        return false ;
        
    }
}
