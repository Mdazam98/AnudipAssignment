package question3;

public class Employe extends Member {
	private String speciliaztion;
	
	public Employe(String name ,int age ,String number ,String adress,String salary,String speciliaztion)
	{
		super(name,age,number,adress,salary);
		this.speciliaztion=speciliaztion;
		
	}
	public void printSpeciliazation()
	{
		System.out.println("speciliaztion  "+speciliaztion);
	}
	
	

}