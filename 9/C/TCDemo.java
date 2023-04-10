import java.io.*;

class TCDemo {
	public static void main(String[] args) {
		int a = 5;
		int b = 2;
		String str = "";
		int m[] = new int[5];
		try {
			System.out.println("\t\tResult= " + a / b);
			System.out.println("\t\tLength= " + str.length());
			m[6] = 9;
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
