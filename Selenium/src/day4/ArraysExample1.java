package day4;

public class ArraysExample1 {

	public static void main(String[] args) {
		int[] a={0,34,79,45,57,41};
		for(int i=0;i<a.length;i=i+2)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("############");
		int[] b=new int[4];
		b[0]=10;
		b[1]=20;
		b[2]=30;
		b[3]=40;
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		System.out.println("###############");
		for (int i : a) 
		{
			System.out.println(i);
		}
		
	}

}
