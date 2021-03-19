import java.util.Scanner;
class BubbleSort
{
	 public int[] bubble(int arr[],int n)
	{
	     if(n==1)
	     return arr;

	     for(int i=0;i<n-1;i++)
	     if(arr[i]>arr[i+1]) 	
	     {
          int temp=arr[i];
          arr[i]=arr[i+1];
          arr[i+1]=temp;
	     }

	     bubble(arr,n-1);
	     return arr;
	}


public static void main(String args[])
{
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter size");
	int size=sc.nextInt();
	System.out.println("enter the values");
	int arr[]=new int[size];
	for(int i=0;i<size;i++)
     {
        arr[i]=sc.nextInt();	
     }
	System.out.println("Binary Sorted list");
	 b.bubble(arr,size);
	int[] x= arr;
	for(int vinay : x)
	{
	System.out.println(vinay);
}
}





