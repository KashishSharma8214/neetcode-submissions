class Solution {

    public int getHours(int[] piles , int mid){
            int totalhours = 0 ; 

            for( int i = 0 ; i < piles.length ; i++){
                totalhours+= (long)Math.ceil((double)piles[i]/mid);
            }
        return totalhours;
    }

    public int minEatingSpeed(int[] piles, int h) {

        int first= 1; 
        int last = 0 ; 
        for( int i : piles){
            last = Math.max(i,last);
        }
        System.out.println( "Max last value :" + last);
        int ans = last;

        while ( first <= last){
            int mid = first + ( last - first) / 2 ;
            System.out.println( "Midvalue :" + mid);
            int hours  = getHours(piles , mid );
            System.out.println( "hours value :" + hours);
            if(hours<=h){
                ans = mid;
                last= mid-1 ;
                

            }
            else{
                first = mid+1;
            }
        }

        return ans;
        }
}
