class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] pfl = new int[n];
        int[] pfr = new int[n];
        int sum = 0;
        pfl[0] = height[0];
        for(int i=1;i<n;i++){
            pfl[i] = Math.max(pfl[i-1],height[i]);
        }
        pfr[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            pfr[i] = Math.max(pfr[i+1],height[i]);
        }
        for(int i=1;i<n;i++){
            int minH = Math.min(pfl[i],pfr[i]);
            sum += Math.max(0,(minH-height[i]));
        }

        return sum;
    }
}
