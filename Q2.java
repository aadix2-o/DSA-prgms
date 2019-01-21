import java.util.Scanner;
class OddPoints
{
	public static void main(String[] args) {
	  int arr[] = new int[10];
   	  Scanner sc = new Scanner(System.in);
   	  int n = arr.length;
   	  for (int i=0;i<n;i++) {
   	  	  arr[i] = sc.nextInt();    
   	  	}
   	  for(int i=0;i<n;i+=2)
   	  {
           if((arr[i]& 1)==0)
           	  System.out.println("number "+arr[i]+" at position "+(i+1));
      }
      sc.close();	
	}
}