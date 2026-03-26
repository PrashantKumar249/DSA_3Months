package Day14;

class RecursiveInsertionSort {

    public int[] insertionSort(int[] nums) {
        sort(nums, nums.length);
        return nums;
    }

    private void sort(int[] arr, int n) {
        if (n <= 1) return;

        sort(arr, n - 1);
        insert(arr, n - 1);
    }

    private void insert(int[] arr, int i) {
        if (i == 0 || arr[i] >= arr[i - 1]) return;

        int temp = arr[i];
        arr[i] = arr[i - 1];
        arr[i - 1] = temp;

        insert(arr, i - 1);
    }
}