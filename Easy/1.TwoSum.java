class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2]; 
        HashMap<Integer, Integer> intBank = new HashMap<Integer, Integer>(); 
        
        for (int i = 0; i < nums.length; i++ ){
            if (intBank.containsKey(target-nums[i])){
                result[1] = i; 
                result[0] = intBank.get(target-nums[i]); 
                return result;
            }
            intBank.put(nums[i],i); 
        }
        return result; 
    }
}
    

