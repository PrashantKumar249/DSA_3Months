package Day9;

class FindRotationCount {
    public int findKRotation(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = (low + high) / 2;

            if (nums[mid] <= nums[high]) {
                high = mid;       // left side me jao
            } else {
                low = mid + 1;    // right side me jao
            }
        }

        return low; // minimum element ka index
    }
}