public class Min_element {
   public static void main(String [] args){
     int[] num = {10,20,50,34,21};
      int min= num[0];
      for(int i=0; i<num.length; i++){
         if(num[i]<min){
           min = num[i];
         }
      }
System.out.println(min);
} 
}