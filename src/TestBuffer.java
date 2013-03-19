import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.InputMap;


public class TestBuffer {
	public static void main(String args[]) throws Exception	{
			//BufferedReader br=new BufferedReader(new FileReader("d://a.txt")); //从文件读
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));//从键盘读
			String buffer=null;
			while((buffer=br.readLine())!=null)
			{
				System.out.println("输出结果为："+buffer);
			}
	}
}
