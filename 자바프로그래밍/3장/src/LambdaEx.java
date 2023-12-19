import java.util.function.IntBinaryOperator;

class Calc
{
	public static int add(int x, int y) { return x+y; }
}

public class LambdaEx {

	public static void main(String[] args) {
		IntBinaryOperator op1, op2;
		
		op1 = (x,y) -> Calc.add(x, y);
		op2 = Calc :: add;
		
		System.out.println(op1.applyAsInt(3,7));
		System.out.println(op2.applyAsInt(3,7));
	}

}
