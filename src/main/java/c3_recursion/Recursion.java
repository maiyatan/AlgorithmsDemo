package c3_recursion;

/**
 * 用递归写一个阶乘方法
 * 
 * @author yangTan
 *
 */
public class Recursion {

	public static void main(String[] args) {
		
		System.out.println(factorial(4));

	}

	private static int factorial(int num) {
		if (num == 1) {
			return 1;
		}

		return num * factorial(num - 1);

	}

}
