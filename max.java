/*find largest and second largest element*/
class max
{
	public static void main(String[] args) {
		int arr[] = new int[]{0,-4};
		int max1=arr[0];
		int max2=arr[1];
		for(int i=1;i<arr.length;i++)
		{
             if(arr[i]>max1)
             	{  
             		max2=max1;
             		max1=arr[i];
             	}
             else if(max1>max2 && arr[i]>max2)
             	max2=arr[i];
		}
		System.out.println(max1+"  "+max2);
	}
}