class Solution {
    public int trap(int[] height) {
        // O(n) memory complexity
        // int[] maxLeft = new int[height.length];
        // int[] maxRight = new int[height.length];
        // int[] min = new int[height.length];
        // int water = 0;
        // int mL=0;
        // int mR=0;

        // for (int i=0; i<height.length; i++){
        //     mL = Math.max(mL,height[i]);
        //     maxLeft[i]=mL;
        // }
        // for (int j=height.length-1; j>=0; j--){
        //     mR = Math.max(mR,height[j]);
        //     maxRight[j]=mR;
        // }
        // for (int k=0; k<height.length; k++ ){
        //     min[k]= Math.min(maxLeft[k],maxRight[k]);
        // }

        // for (int p=0; p<height.length;p++){
        //     if(min[p]-height[p]>0){
        //         water+=min[p]-height[p];
        //     }
        // }
        // return water;

        if (height == null || height.length == 0) {
            return 0;
        }

        int l = 0, r = height.length - 1;
        int leftMax = height[l], rightMax = height[r];
        int res = 0;
        while (l < r) {
            if (leftMax < rightMax) {
                l++;
                leftMax = Math.max(leftMax, height[l]);
                res += leftMax - height[l];
            } else {
                r--;
                rightMax = Math.max(rightMax, height[r]);
                res += rightMax - height[r];
            }
        }
        return res;
    }
}
