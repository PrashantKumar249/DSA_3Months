package Day10;

public class CountOccurrence {
    
    public int countOccurrences(int[] arr, int target) {
        int first = firstOccurrence(arr, target);

        // agar target mila hi nahi
        if (first == -1) return 0;

        int last = lastOccurrence(arr, target);

        return last - first + 1;
    }

    // 🔹 First Occurrence 
    public int firstOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                ans = mid;          // index store karo
                high = mid - 1;     // left side jao
            } 
            else if (arr[mid] < target) {
                low = mid + 1;      // right jao
            } 
            else {
                high = mid - 1;     // left jao
            }
        }
        return ans;
    }

    // 🔹 Last Occurrence (rightmost)
    public int lastOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                ans = mid;          // index store karo
                low = mid + 1;      // right side jao
            } 
            else if (arr[mid] < target) {
                low = mid + 1;      // right jao
            } 
            else {
                high = mid - 1;     // left jao
            }
        }
        return ans;
    }
}
