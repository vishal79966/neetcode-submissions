class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> sum = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++){
            if(i>0 && nums[i-1]==nums[i])continue;
            int p1 = i+1;
            int p2 = n-1;
            while(p1<p2){
                int ans = nums[i]+nums[p1]+nums[p2];
                if(ans ==0){
                    sum.add(Arrays.asList(nums[i],nums[p1],nums[p2]));
                    while(p1<p2 && nums[p1]==nums[p1+1])p1++;
                    while(p1<p2 && nums[p2] == nums[p2-1])p2--;
                    p2--;p1++;
                }else if(ans>0){
                    p2--;
                }else{
                    p1++;
                }

            }
        }
        return sum;
    }
}
