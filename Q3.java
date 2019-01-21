import java.util.Scanner;
class SumBreak
{
	public static void main(String[] args)
    {
	  int arr[] = new int[5];
   	  Scanner sc = new Scanner(System.in);
   	  int i, n = arr.length;
   	  System.out.println("Please input the array");
   	  for (i=0;i<n;i++) {
   	  	  arr[i] = sc.nextInt();    
   	  	}
   	  	i=0;
   	  System.out.println("Sum:");
   	  int sum = sc.nextInt();
   	  for (int num : arr ) {
   	  	   sum-=num;
   	  	   if(sum<0)
   	  	   	{ 
   	  	   		System.out.println("0 to "+i);
   	  	   	    break;
   	  	   	}
   	  	   	i++;

   	  }
	}
}