class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer , Integer > map =  new HashMap<>();

        for(int num : nums){
                map.put(num,map.getOrDefault(num,0)+1);
            }
            System.out.println("MAP First" + map);
    
        List<Integer> list = new ArrayList<>();
        while(k>0) {
            int maxValue = Integer.MIN_VALUE;
            int maxKey = 0;
            
            for(Map.Entry<Integer,Integer> entry : map.entrySet()){
                if(entry.getValue()>maxValue){
                    maxValue = entry.getValue();
                    maxKey = entry.getKey();
                    }
                System.out.println(maxKey + " " + maxValue);
            }
            list.add(maxKey);
            map.remove(maxKey);
            k--;


        }
         System.out.println("Final List " + list);
int[] arr = new int[list.size()];

for( int i = 0 ; i<list.size();i++){
         arr[i] = list.get(i);
    System.out.println("op " + arr);
}
        
        return arr;
    }
}
