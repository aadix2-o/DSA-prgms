class Min
{
	public static int app1(int arr[],int n)
	{
		// Linear search method
		int min = arr[0];
		for(int i=1;i<n;i++)
		{
			if(arr[i]<min)
				min = arr[i];
		}
		return min;
	}
	public static int app2(int arr[],int n)
	{
		// search for point where an element has both of side as greater element
		if(arr[0]<arr[n-1] && arr[0]<arr[1])
			return arr[0];
		for(int i=1;i<n;i++)
		{
            if(arr[i]<arr[(i-1)] && arr[i]<arr[(i+1)%n])
            	return arr[i];
		}
		return -1;
	}
	public static void app3(int arr[])
	{}
	public static void app4(int arr[])
	{}
	public static void main(String[] args) {
		int []arr = new int[]{3,4,5,6,7,2};
		System.out.println(app1(arr,arr.length));
		System.out.println(app2(arr,arr.length));
		System.out.println(app1(new int[]{2,3,4,5,6},5));
		System.out.println(app2(new int[]{1,2,3,4,5,6},6));
	}
}