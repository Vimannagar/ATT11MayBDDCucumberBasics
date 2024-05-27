package steps;

public class Test {
	
	String city;
	
	public static void main(String[] args) {
		
		Test t1 = new Test();
		
		t1.city = "Pune";
		
		t1.city = "Mumbai";
		
		Test t2 = new Test();
		
		System.out.println(t1.city);
	}

}
