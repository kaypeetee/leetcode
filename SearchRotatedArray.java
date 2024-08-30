//4 possible scenarios
//#1 left side is sorted from lthru m, and target is less than L , search the right
//#2 left side is sorted from l thru m and target is less than m, search the left;
//


class Solution {
    public int search(int[] nums, int target) {
        int l=0, r=nums.length-1;

        while(l<=r){
            int m=l+(r-l)/2;
            if(nums[m]==target) return m;
            
            //left sorted portion
            if(nums[l]<= nums[m]){
                // either search left side or right side 3 possibiliotes
                if(target> nums[m] || target< nums[l]){
                    l=m+1;
                } else{
                    r=m-1;
                }


            }else{
                // right sorted portion
                if(target<nums[m] || target> nums[r]){
                    r=m-1;
                } else{
                    l=m+1;
                }

            }
        }

        return -1;
    }
}
