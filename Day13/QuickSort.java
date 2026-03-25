package Day13;

class QuickSort {
    public int[] quickSort(int[] nums) {
        return sort(nums);
    }

    private int[] sort(int[] arr) {
        // base case
        if (arr.length <= 1) return arr;

        int pivot = arr[0];

        // temporary arrays (max size n)
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];

        int l = 0, r = 0, equal = 0;

        // partition
        for (int num : arr) {
            if (num < pivot) {
                left[l++] = num;
            } else if (num > pivot) {
                right[r++] = num;
            } else {
                equal++;
            }
        }

        // resize arrays
        int[] leftArr = new int[l];
        int[] rightArr = new int[r];

        for (int i = 0; i < l; i++) leftArr[i] = left[i];
        for (int i = 0; i < r; i++) rightArr[i] = right[i];

        // recursion
        leftArr = sort(leftArr);
        rightArr = sort(rightArr);

        // merge result
        int[] result = new int[arr.length];
        int k = 0;

        for (int num : leftArr) result[k++] = num;
        for (int i = 0; i < equal; i++) result[k++] = pivot;
        for (int num : rightArr) result[k++] = num;

        return result;
    }
}