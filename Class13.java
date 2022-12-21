package Java13;
import java.util.*;

class Exception520 extends Exception{
}

public class Class13 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		try {
			String a = sc.next();
            sc.close();
			if(a.equals("520")) {
				throw new Exception520();
			}
			else {
				System.out.println(a);
			}
		}
		catch(Exception520 e) {
			System.out.println("這是由字串520所引起的例外");
		}
	}
}
