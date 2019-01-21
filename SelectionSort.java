/*3 6 1 8 4 5*/
public class SelectionSort
{
	public static void main(String[] args) {
		int arr[] = new int[]{8,7,2,4,58,9,12,-5};
		sort(arr,arr.length);
		for (int x :arr ) {
			System.out.print(x+" ");
		}
		
	}
	public static void swap(int arr[] , int a , int b)
	{

		int temp = arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	public static void sort(int a[],int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
					swap(a,i,j);

			}
		}
	}
}