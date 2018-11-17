/* To check the pair with given Sum in the arrray
    3 5 1 7 9 2
	sum=10
	pairs with sum 10 at index 0 & 3
*/
class Sum
{
	public static void main(String[] args)
	{
		int arr[]=new int[]{3,5,1,7,9,2};
        int m1=-1,m2=-1,max=arr[0],sum = (new java.util.Scanner(System.in)).nextInt();
        for(int i=0;i<6;i++)
		{
			if(arr[i]>=max && arr[i]<sum)
			{max= arr[i];
			m1=i;}
		}
    		int search=sum-max;
			for(int i=0;i<6;i++)
		{
			if(arr[i]==search)
			{m2=i;
			break;}
		}
		System.out.println("pair found at index "+m1+" & "+m2);
			
	}
}
