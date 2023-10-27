package intro.java.demo;

class Claculator {
	public int add(int n1, int n2, int n3) {
		return n1 + n2 + n3;
	}
	public int add1(int n1, int n2)
	{
		return n1+n2;
	}
	public double add(double n1, int n2)
	{
		return n1 + n2;
	}
}

public class MethodOverloading {

public static void main(String args[]) {
	Claculator obj = new Claculator();
	int r1=(int) obj.add(12, 10);
	System.out.println(r1);
}
}
