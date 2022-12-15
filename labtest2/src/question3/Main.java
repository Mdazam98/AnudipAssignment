package question3;

public class Main {
	public static void main(String[] args) {
		//instance of Employe
		Employe ob= new Employe("md ajeem azam",37,"7988332213","Lucknow","30000","Engineer");
		
		//instance of manager
		Manager ob1=new Manager("saif",48,"9067332111","lucknow","1000000","Project manager");
		ob.printDetails();
		ob.printSpeciliazation();
		ob.printSalary();
		
		
		ob1.printDetails();
		ob1.printDepartment();
		ob1.printSalary();
		
		
		
	
		
	}

}
