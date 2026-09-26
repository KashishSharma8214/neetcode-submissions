class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();
        int[] arr = new int[k];

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] bucket = new List[nums.length+1];

        for(Map.Entry<Integer,Integer> m : map.entrySet()){
            int frequency = m.getValue();
            
            if(bucket[frequency]==null){
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(m.getKey());

        }
        int count = 0 ; 
        for( int i = bucket.length-1 ; i>=0 ; i--){
            if(bucket[i]!=null){
                for(int j : bucket[i]){
                    arr[count++]=j;
                    if(count==k){
                        return arr;
                    }
                }


            }





        }
        
        return arr;



        
    }
}
