// 283. Move Zeroes
// Brute Force Approach
class Leetcode283 {
    public void moveZeroes(int[] nums) {
        
        int n = nums.length;
        
        int[] temp = new int[n];
        
        int j = 0;
        
        // non-zero elements copy karna
        for(int i = 0; i < n; i++){
            
            if(nums[i] != 0){
                
                temp[j] = nums[i];
                j++;
                
            }
        }
        
        // remaining jagah me 0 fill karna
        while(j < n){
            
            temp[j] = 0;
            j++;
            
        }
        
        // temp ko original array me copy karna
        for(int i = 0; i < n; i++){
            
            nums[i] = temp[i];
            
        }
        
    }
}



// Optimal Approach

// class Leetcode283{
//     public void moveZeroes(int[] nums) {
//          int j = 0;
        
//         for(int i = 0; i < nums.length; i++){
            
//             if(nums[i] != 0){
                
//                 int temp = nums[i];
//                 nums[i] = nums[j];
//                 nums[j] = temp;
                
//                 j++;
                
//             }
//         }
//     }
// }