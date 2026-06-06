class Solution {
    public int checkTarget(int[] nums,int target,int low ,int high){
        int ans = -1;
        int l = low;
        int h = high;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(nums[mid] == target){
                ans = mid;
                break;
            }else if(nums[mid]< target){
                l = mid+1;
            }else{
                h=mid-1;
            }
        }
        return ans;
    }
    public int search(int[] nums, int target) {
        int n = nums.length;
        int l = 0;
        int h = n-1;
        int ans = 0;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(nums[0]>nums[mid]){
                ans = mid;
                h = mid-1;
            }else{
                l = mid+1;
            }
        }
        int t1 = checkTarget(nums,target,0,ans-1);
        if(t1!=-1){
            return t1;
        }
        int t2 = checkTarget(nums,target,ans,n-1);

        return t2;
    }
}
