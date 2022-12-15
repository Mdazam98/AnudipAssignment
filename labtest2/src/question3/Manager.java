package question3;

public class Manager extends Member{
private String department;
   public Manager() {}
	public Manager(String name ,int age ,String number ,String adress,String salary,String department)
	{    //parametized constructor 
		super(name,age,number,adress,salary);
		this.department=department;
		
	}
	public void printDepartment()
	{
		System.out.println("Department  "+department);
	}

}