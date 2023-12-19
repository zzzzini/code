import java.io.*;

public class DeSerializationEx {

	public static void main(String[] args) throws Exception {
		String path = "c:\\temp\\serialTest.dat";
		
		FileInputStream fis = new FileInputStream(path);
		ObjectInputStream in = new ObjectInputStream(fis);
		
		SerializeEx temp = (SerializeEx)in.readObject();
		System.out.println(temp);
	}

}
