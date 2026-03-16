class Longest_subarray {
    public int longestSubarray(int[] nums, int k) {

        int n = nums.length;
        int maxLen = 0;

        for(int i = 0; i < n; i++) {

            int sum = 0;

            for(int j = i; j < n; j++) {

                sum = sum + nums[j];

                if(sum == k) {

                    int len = j - i + 1;

                    if(len > maxLen) {
                        maxLen = len;
                    }
                }
            }
        }

        return maxLen;
    }
}