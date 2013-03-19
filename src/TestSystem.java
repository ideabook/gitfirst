import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;


public class TestSystem {
	public static void main(String args[]) throws Exception, IOException
	{
		Map<String,String >env=System.getenv();
		for(String name:env.keySet())
		{
			System.out.println(name+":------->"+env.get(name));
		}
		System.out.println(System.getenv("JAVA_HOME"));
		System.out.println(System.getenv("path"));
		Properties props=System.getProperties();
		props.store(new FileOutputStream("b.txt"), "System properties");
		System.out.println(System.getProperty("os.name"));
	}
}
