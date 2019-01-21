class ArrayRotation
{ // Implement left rotation of array using several approaches
	/****************************************************************************************************/
	public static void app1(int arr[] , int d)
	{ 
		// One by one shift element to left side
		int temp;
		for(int i=0;i<d;i++)
		{
			temp=arr[0];
            rotateByOne(arr,arr.length);
            arr[arr.length-1]=temp;
		}
		printArray(arr);
		}
		public static void printArray(int arr[])
		{
			for (int x :arr )
			 {
			System.out.print(x+" ");
		}
		System.out.println();
		}
	public static void rotateByOne(int arr[],int n)
	{
		for(int i=1;i<n;i++)
		{
			arr[i-1]=arr[i];
		}
	}
	/******************************************************************************************************/
	public static void app2(int arr[] , int d)
	{
       // Block Swap algorithm to rotate the array by d
		int temp[] = new int[d];
		int n = arr.length;
		for(int i=0;i<d;i++)
		{
			temp[i]=arr[i];
		}
		for(int i=d;i<n;i++)
		{
			arr[i-d]=arr[i];
		}
		for(int i=0;i<d;i++)
		{
			// n=7 d=2 n-d=5
			arr[n-d+i] = temp[i];
		}
		printArray(arr);

	} 
	/******************************************************************************************************/
	public static void app3(int arr[] , int d)
	{
      // Reversal algorithm
		int n = arr.length;
		reverseArr(arr,0,d-1);
		reverseArr(arr,d,n-1);
		reverseArr(arr,0,n-1);
		printArray(arr);
	}
	public static void reverseArr(int arr[],int a,int b)
	{
		while(a<b)
		{
			arr[a]=(arr[a]+arr[b])-(arr[b]=arr[a]);
			a++;
			b--;
		}
	}

	public static void app4(int arr[],int d)
	 {
        // print the rotated array
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
        	System.out.print(arr[(i+d)%n]+" ");
        }
     }
  /************************************************************************************************/
  public static void app5(int arr[],int d)
  {
  	// cloning the array into double of its size
  	int n = arr.length;
  	int temp[]= new int[2*n];
  	for(int i=0;i<n;i++)
  	{
        temp[i]=arr[i];
        temp[i+n]=arr[i];
  	}
  	for(int i=d;i<n+d;i++)
  	{
  		System.out.print(temp[i]+" ");
  	}
  }
   public static void main(String[] args) {
   		
   		int arr[] = new int[]{1,2,3,4,5};
   		System.out.print("approach 1--");
   		app1(arr,2);
   		System.out.print("approach 2--");
   		app2(new int[]{1,2,3,4,5},2);
   		System.out.print("approach 3--");
   		app3(new int[]{1,2,3,4,5},2);
   		System.out.print("approach 4--");
   		app4(new int[]{1,2,3,4,5},2);
   		System.out.print("\napproach 5--");
   		app5(new int[]{1,2,3,4,5},2);

   	}	
}