/* 3 8 5 6 2 7 9 4
   j        i      */
class InsertionSort
{
	public static void main(String[] args) {
		int arr[] = new int[]{9,8,5,5,5,4,4,2,1};
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
	public static void sort(int arr[] ,int n)
	{
	int key,j;	
       for(int i=1;i<n;i++)
       {
          key = arr[i];
          for(j=i;j>0;j--)
          {
          	   if(arr[j-1]>key)
          	   	  arr[j] = arr[j-1];
          	   else 
          	     break;	
          }
           arr[j] = key;  
        }    
	}
}