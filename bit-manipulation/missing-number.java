//TC->O(n) better approach
//SC->O(n)
class Solution {
    public int missingNumber(int[] nums) {
        int[] hash = new int[nums.length+1];
        int num=0;
        for(int i=0;i<nums.length;i++){
            hash[nums[i]] = 1;
        }
        for(int i=0;i<=nums.length;i++){
            if(hash[i]==0){
                num = i;
            }
        }
        return num;
    }
}