class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // triplet -> if length of array is less < 3 zero posiblity

        if (nums == null || nums.length < 3) {
            return new ArrayList<>();
        }
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        System.out.println("Array after Sorted:" + nums);
        int sum = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            int start = i + 1;
            int end = nums.length - 1;

            while (start < end) {
                if (nums[i] + nums[start] + nums[end] == sum) {
                    set.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    start++;
                    end--;
                }
                else if (nums[i] + nums[start] + nums[end] > sum) {
                    end--;
                } else {
                    start++;
                }
            }
        }
        return new ArrayList(set);
    }
}
