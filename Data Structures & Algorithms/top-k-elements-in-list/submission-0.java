class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();

        // Step 1: Count frequency
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        List<Integer> res = new ArrayList<>();

        // Step 2: Find top k frequent keys
        while(k > 0){

            int maxValue = Integer.MIN_VALUE;
            int maxKey = 0;

            for(Map.Entry<Integer,Integer> entry : map.entrySet()){
                if(entry.getValue() > maxValue){
                    maxValue = entry.getValue();
                    maxKey = entry.getKey();
                }
            }

            res.add(maxKey);
            map.remove(maxKey);
            k--;
        }

        // Convert List to array
        int[] ans = new int[res.size()];
        for(int i=0;i<res.size();i++){
            ans[i] = res.get(i);
        }

        return ans;
    }
}
