import java.util.*;
class Missing2Elements
{
	public static void main(String[] args)  
	           {
	             int arr[]=new int[]{1,2,3,4,6,7,9};
	             int n= arr.length;
	            System.out.println("missing elements by approach 1:"+ app1(arr,n));
	            System.out.println("missing elements by approach 2:"+ app2(arr,9));
               System.out.println("missing elements by approach 3:"+ app3(arr,9));
               System.out.println("missing elements by approach 4:"+ app4(arr,9));
                }
 /***************************************************************************************/
    public static Pair app1(int arr[],int n)
    {
    	int a=-1,b=-1;
    	for(int x=0;x<arr.length-1;x++)
           {
              if(arr[x]+1!=arr[x+1])
              {
              	if(a==-1)
              	     a=arr[x]+1;
              	 else
              	 	b=arr[x]+1;
              	if(arr[x+1]!=arr[x]+2)
              		if(a==-1)
              			a=arr[x]+2;
                    else 
                    	b= arr[x]+2;
              }     
           }
        return new Pair(a,b);  
    }
   /***************************************************************************************/ 
    public static Pair app2(int arr[] ,int num)
    {
    	int a,b,Nsum=(num*(num+1))/2,Asum=0,Nsqsum=(num*(num+1)*(2*num+1))/6,Asqsum=0,misNumsum,misNumsqsum,ab;
    	for(int j=0;j<arr.length;j++)
    	{
                Asum+=arr[j];
                Asqsum+=arr[j]*arr[j];
    	}
    	misNumsum = Nsum - Asum;
    	misNumsqsum = Nsqsum - Asqsum;
    	ab = ((misNumsum*misNumsum)-misNumsqsum)/2;
       int misNumdiff= (int)Math.sqrt((misNumsum*misNumsum) - 4*ab);
        a = (misNumdiff + misNumsum)/2;
        b = misNumsum - a;
       return new Pair(a,b);
         
    }
    /****************************************************************************************************/
    public static Pair app3(int arr[] , int n)
    {
    	  int xor=0,pos,x=0,y=0;
          for(int i=0;i<arr.length;i++)
               xor^=arr[i];
          for(int i=1;i<=n;i++)
               xor^=i;
          pos= xor & ~(xor-1);//finding which position has set bit for xor numbers i.e the rightmost set bit will have that bit set for number x and unset for number y
          	 /*while(true)
          	{
          	    if((1 & x)==1)
          	         {rightmostSetBit=pos;
          	         break;}
          	    x>>=1; 
          	    pos++;     
            }*/  	
          for(int i=0;i<n-2;i++)
          	     {
          	     	if((pos&arr[i])==1)
          	     		x^=arr[i];
          	     	else 
          	     		y^=arr[i];
          	     }
           for(int i=1;i<=n;i++)
             {
             	if((i&pos)==1)
             		x^=i;
             	else
             		y^=i;
             }     
        return new Pair(x,y);

     }           
     public static Pair app4(int arr[], int n)
     {
      int a=-1,b=-1;
          HashSet<Integer> hs = new HashSet<>();
          for(int i=0;i<arr.length;i++)
          {
              hs.add(arr[i]);
          }
          for(int j=1;j<=n;j++)
          {
            if(!hs.contains(j))
              {
                  if(a==-1)
                     a=j;
                 else
                  b=j;
              }
          }
        return new Pair(a,b);  
     }

}
class Pair
{
	int a,b;
	Pair(int a,int b)
	{
        this.a=a;
        this.b=b;
	}
	public String toString()
	{
		return (a+" and "+b);
	}
}