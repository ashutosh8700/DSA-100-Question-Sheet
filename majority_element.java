class Solution {
    public int majorityElement(int[] nums) {
        int l = nums.length;

        for(int i = 0;i<l;i++){
            int count = 0;
            for(int j = 0;j<l;j++){
                if(nums[j] == nums[i]){
                    count ++;
                }
            }
        

        if(count > (l/2)){
            return nums[i];
        }
        }

        return -1;
    }
}