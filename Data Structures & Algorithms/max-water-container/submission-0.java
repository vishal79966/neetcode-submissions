class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int ans = 0;
        int p1 = 0;
        int p2 = n-1;
        while(p1<p2){
            int minH = Math.min(heights[p1],heights[p2]);
            int diffW = p2-p1;
            ans = Math.max(ans,(minH*diffW));
            if(heights[p1]<heights[p2]){
                p1++;
            }else{
                p2--;
            }
        }
        return ans;
    }
}
