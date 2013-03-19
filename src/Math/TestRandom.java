package Math;

import java.util.Random;

public class TestRandom {
	public static void main(String args[])
	{
		Random ran= new Random();
		int m=0;
		int count=0;
		for(int j=0;j<10000;j++)
		{
		for(int i=0;i<3;i++){
		//System.out.println(ran.nextInt(4));
		
		m+=ran.nextInt(4);
		}
		
		if(m==4){
		// System.out.println(m);
		 count++;
		}
		 m=0;
		}
		System.out.println(count);
	}
}
