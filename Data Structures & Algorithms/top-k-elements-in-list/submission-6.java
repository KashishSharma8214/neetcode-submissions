class Solution {
    public int[] topKFrequent(int[] nums, int k) {


        HashMap<Integer,Integer> map = new HashMap<>();
        int[] arr = new int[k];

        for( int n : nums){
            map.put(n,map.getOrDefault(n, 0)+1);
        }
        List<Integer>[] bucket = new List[nums.length+1];
        // we need to plus one here because first bucket[0] and we need to traverse till the end.

        for(Map.Entry<Integer,Integer> m : map.entrySet()){
            int freq = m.getValue();
            System.out.println(freq);
            if(bucket[freq]==null){
                bucket[freq]= new ArrayList<>();
            }
            bucket[freq].add(m.getKey());

        

        }
        int count = 0 ;
        for( int i= bucket.length -1 ; i>=0 ; i --){
            if(bucket[i]!=null){
                System.out.println("in last block"+bucket[i]);
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
