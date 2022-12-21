package Java13;

class NotTriangle extends Exception{
}
class EquitlateralTriangle extends Exception{
}
class NotEquitlateralTriangle extends Exception{
}

public class Class12 {
	public static void triangle(int a,int b,int c)throws NotTriangle,EquitlateralTriangle,NotEquitlateralTriangle{
		if(a+b<c || b+c<a || a+c<b) {
			System.out.println("不構成三角形");
		}
		else if(a==b && b==c) {
			System.out.println("這是正三角形");
		}
		else {
			System.out.println("這不是正三角形");
		}
	}
	public static void main(String args[]) {
		try {
			triangle(3,3,3);
		}
		catch(NotTriangle e) {
			System.out.println("不構成三角形");
		}
		catch(EquitlateralTriangle e) {
			System.out.println("這是正三角形");
		}
		catch(NotEquitlateralTriangle e) {
			System.out.println("這不是正三角形");
		}
	}
}
