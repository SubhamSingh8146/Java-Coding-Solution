class Solution {
    public int maxWidthRamp(int[] nums) {
        int diff=0;
        int count=0;
        // check is array is sorted in descending order
        for (int i = 0; i < nums. length - 1; i++) 
        { if (nums[i] <= nums[i + 1]) { break;}count++;
        }
        if(count==nums.length-1)return 0;// array is descending return 0;
        for(int i=0;i<nums.length-1;i++){
            int j=nums.length-1;// start from last element
            while(j>i && diff <(j-i)){
                if(nums[i]<=nums[j]){diff=j-i;break;}j--;// if difference found which is greater than previous break the loop
                if(j<=i)break; 
                if(nums[i]<=nums[j] && diff <(j-i)){diff=j-i;break;}j--; 
                if(j<=i)break; 
                if(nums[i]<=nums[j] && diff <(j-i)){diff=j-i;break;}j--; 
            }
        }
        return diff;
    }
}