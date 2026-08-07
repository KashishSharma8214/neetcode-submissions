class Solution {
    public int maxArea(int[] heights) {


        int start = 0 ; 
        int end = heights.length-1;
        int maxarea = Integer.MIN_VALUE;

        while( start < end ){

                int minHeight = Math.min(heights[start],heights[end]);
                int width = end-start;
                int area = minHeight * width ;

                maxarea = Math.max(area,maxarea);

                if(heights[start]<heights[end]){
                    start++ ;
                }
                else{
                    end --;
                }

        }
        return maxarea;
        
    }
}
