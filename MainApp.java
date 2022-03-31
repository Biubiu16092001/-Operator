import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		int a,b;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a = ");
		a = sc.nextInt();
		System.out.println("Nhap b = ");
		b = sc.nextInt();
		
		int tong = a + b;
		System.out.format("%d + %d = %d ", a, b, tong).println();
		
		int hieu = a - b;
		System.out.format("%d - %d = %d ", a, b, hieu).println();
		
		int tich = a * b;
		System.out.format("%d * %d = %d ", a, b, tich).println();
		
		float thuong =(float) a / b;
		System.out.format("%d / %d = %.2f ", a, b, thuong).println();
		
		String c;
		
		c = a>b?">":a==b?"=":"<";
		System.out.println("Ket qua so sanh a voi b: " + c);
		
		
		
	}

}
