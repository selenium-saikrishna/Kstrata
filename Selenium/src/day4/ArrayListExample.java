package day4;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	
	public static void main(String[] args) {
		List<String> l=new ArrayList<>();
		l.add("selenium");
		l.add("jmeter");
		l.add("lr");
		l.add("codedui");
		
		System.out.println(l.size());
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}
		
		
	}

}
