package Java13;
import java.io.*;

class ArgumentOutOfBound extends Exception{
}

public class Class15 {
	public static void mySqrt(int x) throws ArgumentOutOfBound{
		if(x < 0) {
			throw new ArgumentOutOfBound();
		}			
		else {
			System.out.println(Math.sqrt(x));
		}
	}
	public static void main(String args[]) throws IOException{
		BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
		try {
			String b = a.readLine(); 
			mySqrt(Integer.parseInt(b));
		}
		catch(ArgumentOutOfBound e) {
			System.out.println("n小於0");
		}
	}
}
