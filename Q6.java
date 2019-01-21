/* find the missing element*/
class Q6
{
	public static void main(String[] args) {
		int arr[] = new int[]{1,2,3,5,6,7,8,9};
        System.out.println(app1(arr,arr.length));
        System.out.println(app2(arr,arr[arr.length-1]));
        System.out.println(app3(arr,arr[arr.length-1]));
	}
	public static int app1(int arr[],int n)
	{
		int ans=0;
        for(int i=1;i<n-1;i++)
        {
        	if((arr[i]+1)!=arr[i+1])
        		{
        			ans=arr[i]+1;
        	        break;
        	    }
        }
     return ans;
	}
	public static int app2(int arr[],int n)
	{
		int nsum = n*(n+1)/2;
		int  arrsum=0;
		for(int i=0; i<n-1;i++)
			arrsum+=arr[i];
		
		return nsum-arrsum;	 
		
	}
	public static int app3(int arr[],int n)
	{
		int nxor=0,arrxor=0;
		for(int i=1;i<=n;i++)
			nxor^=i;
		for(int i=0;i<arr.length;i++)
			arrxor^=arr[i];
      return nxor ^ arrxor;   
	}
}