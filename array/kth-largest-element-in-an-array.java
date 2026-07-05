class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int num=0;
        int j=k;
        for(int i=nums.length-1;i>=0;i--){
            if(j==1){
                num = nums[i];

            }
            j--;
        }
        return num;
    }
}