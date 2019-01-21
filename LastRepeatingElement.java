import java.util.*;
class LastRepeatingElement
{
	public static int app1(int arr[], int n)
	    {
           
           for(int i=n-1;i>0;i--)
           {
           	   for(int j=i-1;j>=0;j--)
           	   {
           	   	    if(arr[i]==arr[j])
           	   	    	return arr[i];
           	   }
           }
           return -1;
	    }
	public static int app2(int arr[] , int n)
	{
        HashSet<Integer> hs = new HashSet<>();
        int idx = -1;
        for(int i=0;i<n;i++)
        {
        	if(hs.contains(arr[i]))
        		  idx=i;
        	else
        	    hs.add(arr[i]);	
        }
        return arr[idx];
	}
	public static void main(String[] args)
	{

		int arr[] = new int[]{1,2,5,7,3,8,2,1,4,3};
        System.out.println("Last repeating element in array is"+app1(arr,arr.length));
        System.out.println("Last repeating element in array is"+app2(arr,arr.length));
    }
}