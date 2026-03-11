public class Leetcode1 {

    public static void main(String[] args) {

        int[] nums = {2,7,11,15};
        int target = 9;

        for(int i = 0; i < nums.length; i++) {

            for(int j = i + 1; j < nums.length; j++) {

                if(nums[i] + nums[j] == target) {

                    System.out.println(i + " " + j);

                }

            }

        }

    }
}


// import java.util.Scanner;

// public class Leetcode1 {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter size of array: ");
//         int n = sc.nextInt();

//         int[] nums = new int[n];

//         System.out.println("Enter array elements:");

//         for(int i = 0; i < n; i++) {
//             nums[i] = sc.nextInt();
//         }

//         System.out.print("Enter target: ");
//         int target = sc.nextInt();

//         for(int i = 0; i < nums.length; i++) {

//             for(int j = i + 1; j < nums.length; j++) {

//                 if(nums[i] + nums[j] == target) {
//                     System.out.println("Indices: " + i + " " + j);
//                 }

//             }

//         }

//     }
// }