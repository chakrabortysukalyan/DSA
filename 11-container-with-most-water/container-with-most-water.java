class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int low=0; int high=n-1;
        int h,water=0;
        while(low<high)
        {
            h=Math.min(height[low],height[high]);
            water=Math.max(water, h*(high-low));

            if (height[low]<height[high])
                    low++;
            else 
            high--;
        }
        return water;
    }
}