package basicSyntax;

public class MethodPractice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 10;
		int b = 5;

		// メソッド1〜4の計算結果を順番に出力
		int sumResult = add(a, b);
		int subtractResult = subtract(a, b);
		int multiplyResult = multiply(a, b);
		int divideResult = divide(a, b);

		// メソッド5を使って計算結果を出力
		printResult(sumResult);
		printResult(subtractResult);
		printResult(multiplyResult);
		printResult(divideResult);
	}

	// 二つの値を足し算するメソッド
	private static int add(int a, int b) {
		return a + b;
	}

	// 二つの値を引き算するメソッド
	private static int subtract(int a, int b) {
		return a - b;
	}

	// 二つの値を掛け算するメソッド
	private static int multiply(int a, int b) {
		return a * b;
	}

	// 二つの値を割り算するメソッド
	private static int divide(int a, int b) {
		return a / b;
	}

	// コンソールに出力するためのメソッド
	private static void printResult(int result) {
		System.out.println("計算結果は" + result + "です。");
	}

}
