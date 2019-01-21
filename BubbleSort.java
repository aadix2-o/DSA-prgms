class BubbleSort
{
	public static void main(String[] args) {
		int arr[] = new int[]{1,9,52,7,4,3};
		sort(arr,arr.length);
		for (int x : arr ) {
			System.out.print(x+"<");
		}
		
	}
	public static void swap(int arr[] , int a , int b)
	{

		int temp = arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	public static void sort(int arr[],int n)
	{
        for (int i=0;i<n;i++) 
        {
           for (int j=0;j<n-i-1 ;j++) 
           {
           		if(arr[j]>arr[j+1])
           			swap(arr,j,j+1);

           	}	
        }
	}
}