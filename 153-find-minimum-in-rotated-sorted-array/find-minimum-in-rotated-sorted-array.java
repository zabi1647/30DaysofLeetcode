class Solution {
    public int findMin(int[] nums) {
        if(nums[0]<nums[nums.length -1]){
            return nums[0];
        }
        int start = 0;
        int end = nums.length -1;
        while (start<end){
            int mid = start +(end - start)/2;
            if(nums[mid]< nums[end]){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return nums[start];
    }
}