class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int min = Integer.MAX_VALUE;
        int cs =  0;
        for(int r = 0; r < nums.length; r++){
            cs += nums[r];
            while(cs >= target){
                min = Math.min(min , r - l + 1);
                cs -=nums[l];
                l++;
            }
        }
return min == Integer.MAX_VALUE ? 0 : min; 
   }
}