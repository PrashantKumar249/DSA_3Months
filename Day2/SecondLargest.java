package Day2;

public class SecondLargest {
    // public int secondLargest(int[] num){
    public static void main(String[] args){
        int[] num = {1,2,3,4,5};
        int largest = num[0];
        int secondLargest = -1;

        for(int i=1; i<num.length; i++){
            if(num[i]>largest){
                secondLargest = largest;
                largest = num[i];
            }
            else if(num[i]> secondLargest && num[i]!= largest){
                secondLargest = num[i];
            }
        }
        System.out.println("Second Largest: " + secondLargest);
    }

}



// class Solution {
//     public int secondLargestElement(int[] nums) {

//         int largest = nums[0];
//         int secondLargest = -1;

//         for(int i = 1; i < nums.length; i++) {

//             if(nums[i] > largest) {
//                 secondLargest = largest;
//                 largest = nums[i];
//             }

//             else if(nums[i] < largest && nums[i] > secondLargest) {
//                 secondLargest = nums[i];
//             }
//         }

//         return secondLargest;
//     }
// }
