package secondQuestion;

public class Square implements Shape  {
	int len = 15;

	@Override
	public int area() {
		int area = len*len;
		return area; 
	}
		

}