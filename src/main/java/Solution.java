public class Solution {
    public int minKBitFlips(int[] nums, int k) {
        int n = nums.length;
        int res = 0;
        int windowCount = 0;
        int[] flipTrack = new int[n];

        for(int i = 0; i <= n - k; i++) {
            if(i - k >= 0){
                windowCount -= flipTrack[i - k];
            }
            if((nums[i] == 1 && windowCount % 2 == 1) || (nums[i] == 0 && windowCount % 2 == 0)) {
                flipTrack[i] = 1;
                nums[i] = 1;
                windowCount++;
                res++;
            }else {
                nums[i] = 1;
            }
        }

        for(int i = n - k + 1 ; i < n; i++){
            if(i - k >= 0) {
                windowCount -= flipTrack[i - k];
            }

            if((nums[i] == 1 && windowCount % 2 == 0) || (nums[i] == 0 && windowCount % 2 == 1)){
                continue;
            }else return -1;

        }

        return res;
    }
}
