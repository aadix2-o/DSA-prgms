import java.util.Scanner;
class LSearch
{
	public static void main(String[] args) {
		 int arr[] = new int[5];
   	  Scanner sc = new Scanner(System.in);
   	  int n = arr.length , sum=0,i;
   	  for (int x=0;x<n;x++) {
   	  	  arr[x] = sc.nextInt();    
   	  	}
   	  	System.out.println("Please enter the number you want to search");
   	  	int num = sc.nextInt();
   	  	searchIteration(arr,num,n);
   	  	recursionSearch(arr,num,n-1);
	}
	public static void recursionSearch(int arr[],int num,int i)
	{
		if(i<0)
			{
			System.out.println("Sorry not found");
		    return;
		    }
		    if(arr[i]==num)
		    {
		    	System.out.println("Element found at index "+i);
		    	return;
		    }
		recursionSearch(arr,num,i-1);
		    

	}
	public static void searchIteration(int arr[],int num,int n)
	{   int i;
		for(i=0;i<n;i++)
   	  	{
   	  		if(arr[i]==num)
   	  			{
   	  				System.out.println("Element found at index "+i);
   	  		        break;
   	  		    }
   	  	}
   	  	if(i==n)
   	  		System.out.println("Element not found");
	}
}