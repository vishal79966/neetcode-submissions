class Solution {
    public boolean checkIf(int[] piles,int n,int h,int mid){
        int k = 0;
        for(int i=0;i<n;i++){
            k+=(piles[i]+mid-1)/mid;
        }
        if(k<=h)return true;
        return false;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int maxB = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            maxB = Math.max(maxB,piles[i]);
        }
        int l =1;
        int hi = maxB;
        int ans = 0;
        while(l<=hi){
            int mid = l+(hi-l)/2;
            if(checkIf(piles,n,h,mid)){
                ans = mid;
                hi = mid-1;
            }else{
                l = mid+1;
            }
        }
        return ans;
    }
}
