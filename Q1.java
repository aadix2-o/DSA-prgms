import java.util.Scanner;
class SumOfArray
{
   public static void main(String[] args) {
   	  int arr[] = new int[10];
   	  Scanner sc = new Scanner(System.in);
   	  int n = arr.length , sum=0;
   	  for (int i=0;i<n;i++) {
   	  	  arr[i] = sc.nextInt();    
   	  	}
   	  for (int a :arr) {
   	  		sum+=a;
   	  	}
   	  System.out.println("sum of the array elements is"+ sum);		
   }
}
/* we can add the elements while taking input only*/
/*
    for (int i=0;i<n;i++) {
   	  	  arr[i] = sc.nextInt();
   	  	  sum+=arr[i];
   	  	}
*/