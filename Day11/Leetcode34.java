class Leetcode34 {
    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        return new int[]{first, last};
    }

    // Find First Occurrence
    public int findFirst(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int first = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                first = mid;        // store index
                high = mid - 1;     // move left
            } 
            else if (nums[mid] < target) {
                low = mid + 1;      // move right
            } 
            else {
                high = mid - 1;     // move left
            }
        }
        return first;
    }

    // Find Last Occurrence
    public int findLast(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int last = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                last = mid;         // store index
                low = mid + 1;      // move right
            } 
            else if (nums[mid] < target) {
                low = mid + 1;      // move right
            } 
            else {
                high = mid - 1;     // move left
            }
        }
        return last;
    }
}