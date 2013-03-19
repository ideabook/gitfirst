import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class TestScannerFile {
	public static void main(String agrs[]) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("a.txt的内容如下：");
		String a=";
		while(sc.hasNextLine())
		{
			a+=sc.nextLine();
			System.out.println(a);
		}
	}
}
