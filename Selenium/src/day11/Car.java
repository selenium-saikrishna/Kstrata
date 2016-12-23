package day11;

public class Car {

	int price;
	String model;
	public void carDetails(int price,String model)
	{
		this.price=price;
		this.model=model;
	}
	public static void main(String[] args) {
		Car c=new Car();
		
		c.carDetails(1111,"audi");
		System.out.println(c.price+"---"+c.model);

	}

}
