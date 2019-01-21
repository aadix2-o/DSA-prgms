class MergeSort
{
	public static void main(String[] args) {
		int arr[] = new int[]{2,8,9,4,6,7,1,3};
		System.out.println();
		mergeSort(arr,0,arr.length-1);
		
		
	}
	public static void mergeSort(int []arr, int low , int high)
	{
		if(low<high)
		{
			int mid= low + (high - low)/2;
			mergeSort(arr ,low ,mid);
			mergeSort(arr , mid+1 , high);
			merge(arr,low , mid ,high);
		}
	}
	public static void merge(int arr[] , int low , int mid , int high)
	{
		int n1=mid-low+1;
	    int n2=high-mid;
	    int a[] = new int[8];
	    int left[] = new int[n1];
	    int right[]= new int[n2];
	    for(int i=0;i<n1;i++)
	{
		left[i]=a[low+i];
	}
	for(int i=0;i<n2;i++)
	{
		right[i]=a[mid+1+i];
	}	
	    int i=0 , j=0 ,k=0;
		while(i<n1 && j<n2)
		{
			if(left[i]<=right[j])
				
				a[k++] = left[i++];
			else
				a[k++] = right[j++];
        }
         while(i<n1)
         	a[k++] = left[i++];
         while(j<n2)
         	a[k++] = right[j++];
         System.out.println("size"+ a.length);
         for(int x : a)
		{
			System.out.print(x+" , ");
		}

	}

}