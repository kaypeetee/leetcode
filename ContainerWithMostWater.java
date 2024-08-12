class Solution {
    public int maxArea(int[] height) {
        int l=0, r= height.length-1;

        int m=0;
        while(l<r){
            m=Math.max(m,Math.min(height[l],height[r])*(r-l));

            if(height[l]<height[r]){
                l++;
            } else if (height[l]>height[r]){
                r--;
            }else{
                l++;
            }
        }
        return m;
    }
}
