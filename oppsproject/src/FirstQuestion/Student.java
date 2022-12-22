package FirstQuestion;

import java.util.Arrays;

public class Student extends Person {
	static final String instituteName = "Lucknow Institute of technology";
	String RollNo;
	String[] subject  ;
	Student()
	{
		
	}
	
	Student(String RollNo,String subject[],String name,int age,String mobile)
	{
		super(name,age,mobile);
		this.RollNo=RollNo;
		this.subject=subject;
		
		
		
	}

	@Override
	public String toString() {
		return "Student [RollNo=" + RollNo + ", subject=" + Arrays.toString(subject) + ", name=" + name + ", age=" + age
				+ ", mobile=" + mobile + "]";
	}

	
}