class Solution {
    public boolean hasDuplicate(int[] nums) {
        int j = 1; 
    for(int i = 0 ; i< nums.length; i++){
        for(j = i+1 ; j<nums.length;j++){
            if(nums[i]==nums[j]){
                return true ; 
            }
        }
    }
        return false;
    }
}