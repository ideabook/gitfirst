import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.InputMap;


public class TestBuffer {
	public static void main(String args[]) throws Exception	{
			//BufferedReader br=new BufferedReader(new FileReader("d://a.txt")); //���ļ���
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));//�Ӽ��̶�
			String buffer=null;
			while((buffer=br.readLine())!=null)
			{
				System.out.println("������Ϊ��"+buffer);
			}
	}
}
