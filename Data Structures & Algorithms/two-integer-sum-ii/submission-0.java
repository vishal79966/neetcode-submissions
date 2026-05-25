class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int[] ans = new int[2];
        int p1 = 0;
        int p2 = n-1;
        while(p1<p2){
            int t = numbers[p1] + numbers[p2];
            if(t>target){
                p2--;
            }else if(t<target){
                p1++;
            }else{
                break;
            }
        }
        ans[0] = p1+1;
        ans[1] = p2+1;
        return ans;
    }
}
