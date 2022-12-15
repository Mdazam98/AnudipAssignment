package question3;

public class Member {private String name;
private int age;
private String number;
private String adress;
private String salary;
 Member(){}
 Member(String name ,int age ,String number ,String adress,String salary){
	 this.name=name;
	 this.age = age;
	 this.number=number;
	 this.adress=adress;
	 this.salary=salary;
	 
 }

public void printSalary()
{
	System.out.println("the salary of employee is "+salary);
}
public void printDetails()
{
	System.out.println("name  "+name);
	System.out.println("age  "+age);
	System.out.println("number  "+number);
	System.out.println("adress  "+adress);
	System.out.println("salary  "+salary);
	
}



}
