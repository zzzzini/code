import java.io.Serializable;

public class SerializeEx implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	
	public SerializeEx(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public String toString()
	{
		return String.format("%s, %d", name, age);
	}

}
