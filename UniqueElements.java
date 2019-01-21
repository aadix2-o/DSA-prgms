import java.util.*;
class UniqueElements
{
      public static void main(String[] args) 
      {
         HashSet<Integer> hs = new HashSet<>();
         int arr[] = new int[]{1,3,8,3,6,9,2,7,9,3,4,8,6};
         for(int i=0;i<arr.length;i++)
         {
         	  hs.add(arr[i]);
         } 	
         for (Integer x :hs ) {
         	System.out.println(x);
         }
     }
}