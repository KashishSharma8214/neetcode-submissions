class Solution {
    public boolean hasDuplicate(int[] nums) {

        Set<Integer> removeDuplicate = new HashSet<>();

        for( int start : nums){
            if(removeDuplicate.contains(start)){
                return true;
            }
            removeDuplicate.add(start);
        }

        return false;
    }
}