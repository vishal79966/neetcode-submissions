class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>hs = new HashSet<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            hs.add(nums[i]);
        }
        int cnt =0;
        int maxCnt = 0;
        for(int i=0;i<n;i++){
            int temp = nums[i];
            while(hs.contains(temp)){
                cnt++;
                temp = temp+1;
            }
            maxCnt = Math.max(maxCnt,cnt);
            cnt=0;
        }
        return maxCnt;
    }
}
