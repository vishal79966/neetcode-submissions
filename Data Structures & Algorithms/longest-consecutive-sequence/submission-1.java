class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>hs = new HashSet<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            hs.add(nums[i]);
        }
        
        int maxCnt = 0;
        for(int i=0;i<n;i++){
            int temp = nums[i];
            if(!hs.contains(temp-1)){
                int num = temp;
                int cnt =1;
                while(hs.contains(num+1)){
                    num++;
                    cnt++;
                }
            
                
                maxCnt = Math.max(maxCnt,cnt);
                
            }
        }
        return maxCnt;
    }
}
