class Solution {
    public int removeElement(int[] nums, int val) {
        int low=0;
        int high=nums.length -1;
        int c=0;
        if(nums.length==1)
        {
            if(nums[0]==val)
            {
                nums=null;
                return 0;
            }
            else
            {
                return 1;
            }
        }
        while(low<=high)
        {
            if (nums[high]==val)
            {
                high--;
                c++;
            }
            else
            {
                if(nums[low]==val)
                {                    
                    nums[low]=nums[high];                    
                    c++;
                    high--;
                }
                else low++;
            }
        }
        return(nums.length-c);
    }
}