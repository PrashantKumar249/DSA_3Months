package Day9;

//brute force approach
class FindRotationCount2 {
    public int findKRotation(int[] nums) {
        int min = nums[0];
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
                index = i;
            }
        }

        return index;
    }
}