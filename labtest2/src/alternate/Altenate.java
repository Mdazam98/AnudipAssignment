package alternate;

public class Altenate {
    //printing the alternate no
	int add=0;
	 void printAlter(int []arr1,int[]arr2 ,int N)
	{
	    int j=0;
		for(int index=0;index<N;index++)
		{
		
			if(index%2==0) {
				
				arr2[j]=arr1[index];
				
				add =add+arr1[index];
				
				System.out.println(arr2[j]);
				j++;
			}
			
				
		}
		
		//the additon of the alternate value,
		System.out.println("the addition of all alternate number is :"+add);
	}
	

public static void main(String[] args)
{
	int []arr1= {10,20,30,40,50,60,70,80,90,100};  
	int []arr2=new int[6];
	int N=arr1.length;
	Altenate obb=new Altenate();     //instance of Altenate
	obb.printAlter(arr1,arr2,N);
			
}

}
