/*  Three Smallest
  8,7,2,4,58,9,12,-5  */
class Q5
{
	public static void main(String[] args) {
		int arr[] = new int[]{8,7,2,4,58,9,12,-5};
		threeSmallest(arr,arr.length);

	}
	public static void threeSmallest(int []a, int n)
	{
		for(int i=0;i<3;i++)
		{
			for(int j=i+1;j<n;j++)
				if(a[i]>a[j])
					InsertionSort.swap(a , i , j);
		System.out.println(a[i]);
		}
		
	}
}