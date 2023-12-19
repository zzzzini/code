public class GenericEx2<T> {
	
	T val;
	void set(T a) {
		val = a;
	}
	T get() {
		return val;
	}
	
	public static void main(String[] args) {
		GenericEx2<String> s = new GenericEx2<String>();
		s.set("hello");
		System.out.println(s.get());
		
		GenericEx2<Integer> n = new GenericEx2<Integer>();
		n.set(5);
		System.out.println(n.get());

	}

}
