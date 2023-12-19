import java.io.*;

public class SerializationEx {

	public static void main(String[] args) throws Exception {
		SerializeEx obj = new SerializeEx("홍길동", 24);
		
		String path = "c:\\temp\\serialTest.dat";
		FileOutputStream fos = new FileOutputStream(path);
		ObjectOutputStream out = new ObjectOutputStream(fos);
		
		out.writeObject(obj);
		
		System.out.println("객체저장 완료");
	}

}
