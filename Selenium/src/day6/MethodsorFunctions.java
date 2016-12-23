package day6;

public class MethodsorFunctions {
	
	public static void main(String[] args) {
		int a=10,b=20,c=30;
		int r=100;
		r=sumAll(a,b,c);
		System.out.println(r);
		

	}
	
	public static  int  sumAll(int i,int j,int k)
	{
		int result=i+j+k;
		return result;
	}

}






