package Day9;

class FindSingleCount {
    public int singleNonDuplicate(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = (low + high) / 2;

            // mid ko even index pe lao
            if (mid % 2 == 1) {
                mid--;
            }

            if (nums[mid] == nums[mid + 1]) {
                low = mid + 2;   // right side
            } else {
                high = mid;      // left side
            }
        }

        return nums[low];
    }
}
