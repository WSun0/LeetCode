class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> differences = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            if(differences.containsKey(target - nums[i])) {
                return new int[]{i, differences.get(target - nums[i])};
            } else {
                differences.put(nums[i], i);
            }
        }
        return new int[]{1, 2};
    }
}