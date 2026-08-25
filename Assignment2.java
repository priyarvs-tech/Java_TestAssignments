public class Assignment2 {
	public static void main(String[]args) {
	Assignment2 obj = new Assignment2();
	int c = obj.add(5, 3);
	int d = obj.subtract(8, 2);
	double e = obj.multiply(1000, 2000, 300);
	float f = obj.divide(12, 8);
	System.out.println(c);
	System.out.println(d);
	System.out.println(e);
	System.out.println(f);
	}
	public  int add (int a,int b) {
		return a+b;
		
	}
	
	public int subtract (int a, int b) {
		return a-b;
	}
	
	public double multiply (double i, double j, double k) {
		return i*j*k;
	}
	
	public float divide (float a, float b) {
		return a/b;
	}
	
	}
	