class Solution {
    public boolean hasDuplicate(int[] nums) {
   Set<Integer> newSet = new HashSet<>();

   for( int n : nums){
    if(newSet.contains(n)){
        return true;
    }
    newSet.add(n);
   }
   return false;
}
}