package matrix;

public class matrix {
	//adding and printing addition of 2 matrices
	public void addition(int a[][], int b[][] ,int c[][] ) {
		 for(int i=0;i<3;i++) {
		    	for(int j=0;j<3;j++){
		    		c[i][j]=a[i][j]+b[i][j];     
		    		 
		    		
		    	}
		    
		    }
		
	}
	
	// printing the addition matrix 
	public void display(int c[][]) {
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		//creating two matrices    
		int a[][]={{10,20,30},{40,50,60},{60,70,80}};    
		int b[][]={{1,3,4},{4,5,6},{7,8,9}};
		
		//creating another matrix to store the sum of two matrices 
		
	    int c[][]=new int[3][3]; 
	    
	   
	    
	    
	    
	    matrix aa = new matrix(); // create new instances 
	    aa.addition(a, b, c);
	    aa.display(c);
	    

	}

}
