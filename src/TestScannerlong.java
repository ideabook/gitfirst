import java.util.Scanner;


public class TestScannerlong {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextLong())
		{
			System.out.println("����Ľ��Ϊ��"+sc.nextLong());
		}
		
	}
}
