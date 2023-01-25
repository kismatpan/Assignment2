//********* ASSIGNMENT_2 ******************
	// ASSIGNMENT DOESN'T HAVE PROPER ARRAY LENGTH,
	//SO FOR THAT REASON WE ARE USING CUSTOME MADE VALUES FOR ARRAY 
	//****************SELECTION SORT***************************** 
import java.util.*;
public class SelectionSort {
		public static void Sort(int [] a)
		{
			for(int i=0;i<a.length-1;i++)
			{  int Small=i;
				for(int j=i+1; j<a.length; j++)
				{
					if(a[Small]>a[j])
					{
						Small=j;
					}
				}
				int tempVar=a[Small];
				a[Small]=a[i];
				a[i]=tempVar;
					
			}
			for(int elem:a)
			{   
				
				System.out.print(elem + " ");
			}
		}

		public static void main(String[] args)
		{
			@SuppressWarnings("resource")
			Scanner Scan=new Scanner(System.in);
			System.out.println("*****Enter the size of an [ ARRAY ]*****");
			int Size=Scan.nextInt();
			int[] ar= new int [Size];
			for(int i=0; i<ar.length;i++)
			{
				System.out.println("Enter the  Random Numbers (Unsorted)for that ARRAY "
						+"for index" + " " + i);
				ar[i]=Scan.nextInt();
			}
			System.out.println("---The Values/Elements for an Array are as Follows Types---");
			for(int i=0;i<ar.length;i++)
			{
				System.out.print(ar[i]+" ");
			}
			System.out.println();
			System.out.println("^^^^^ *_The Sorted Elements of an Array are_* ^^^^^");
			
			// SELECTION SORTING
			Sort(ar);
		}

	}


