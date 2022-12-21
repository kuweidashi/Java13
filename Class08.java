package Java13;

class Ctest
{
    public Ctest(int a,int b) throws ArithmeticException{
        int num = a;
		int den = b;
		int ans = num / den;
    }
}

public class Class08 {
	public static void main(String args[]) {
		try {
			new Ctest(12, 0);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("end of main()");		
	}
}
