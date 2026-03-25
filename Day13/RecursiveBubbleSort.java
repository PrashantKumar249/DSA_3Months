package Day13;

class RecursiveBubbleSort {
    public int[] bubbleSort(int[] nums) {
        bubble(nums, nums.length);
        return nums;
    }

    private void bubble(int[] arr, int n) {
        // base case
        if (n == 1) return;

        // ek pass (largest element end me jayega)
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        // recursion for remaining array
        bubble(arr, n - 1);
    }
}