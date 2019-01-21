import java.util.*;
class FirstRepeatingElement
{
	public static int app1(int arr[],int n)
	{
       for(int i=0;i<n-1;i++)
       {
       	  for(int j=i+1;j<n;j++)
       	  {
       	  	  if(arr[i]==arr[j])
       	  	  	  return arr[i];
       	  }
       }
       return -1;
	} 
	public static int app2(int arr[] ,int n)
	{
		HashSet<Integer> hs = new HashSet<>();
		  int idx=-1;
          for(int i=n-1;i>=0;i--)
          {
                 if(hs.contains(arr[i]))
                 	idx=i;
                 else 
                 	hs.add(arr[i]);
          }
          return arr[idx];
	}

	public static void main(String[] args) {
		int arr[] = new int[]{1,2,6,4,3,2,1,3,6,8};
		System.out.println("First repeating element in array is "+app1(arr,arr.length));
		System.out.println("First repeating element in array is "+app2(arr,arr.length));


	}
}