class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer , Integer> map = new HashMap<>();

for(int num : nums){
 map.put(num , map.getOrDefault(num,0)+1);
 }
//{{1,0},{2,2},{3,2}}
List<Integer> list = new ArrayList<>();
int n = 1;
while(k > 0){
    int maxValue = Integer.MIN_VALUE;
    int maxKey= 0; 

    for(Map.Entry<Integer,Integer> entry : map.entrySet()){
        if(entry.getValue()>maxValue){
            maxValue = entry.getValue();
            maxKey = entry.getKey();
        }
        
    }
    list.add(maxKey);
    map.remove(maxKey);
    k--;

}
        int[] ans = new int[list.size()];
        for(int i = 0; i<list.size();i++)
        {
            ans[i]= list.get(i);
        }
    return ans;
    }

}
