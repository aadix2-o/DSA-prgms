/*find the 3 largest elements of an array*/
class Q4
{
	public static void main(String[] args) {
		int arr[] = new int[]{8,7,2,4,58,9,12,-5};
		System.out.println("Three Largest elements");
		threeLargest(arr , arr.length);
		
	}
	public static void threeLargest(int arr[] , int n)
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
					SelectionSort.swap(arr,j,j+1);
			}
			System.out.println(arr[n-i-1]);
		}
	}
}