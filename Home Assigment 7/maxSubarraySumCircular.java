class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int sum = nums[0];
        int min = nums[0];
        int total = 0;
        for(int i =0;i<n;i++){
            total+=nums[i];
        }
        for(int i =1;i<n;i++){
           sum = Math.min(sum+nums[i],nums[i]);
           min = Math.min(sum,min);
        }
        int max1 = total-min;
        int max2 = nums[0];
        int sum1 = nums[0];

        for(int i =1;i<n;i++){
            sum1 = Math.max(sum1+nums[i],nums[i]);
            max2 = Math.max(max2,sum1);
        }
        if(max2>0)
         return Math.max(max1,max2);

         return max2;
      

    }
}