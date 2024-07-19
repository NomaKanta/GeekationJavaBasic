package basicSyntax;

public class MethodPractice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 10;
		int b = 5;

		int addUpResult = addUp(a, b);
		int subtractResult = subtract(a, b);
		int multiplyResult = multiply(a, b);
		int divideResult = divide(a, b);
		
		printResult(addUpResult);
        printResult(subtractResult);
        printResult(multiplyResult);
        printResult(divideResult);

	}

	// 足し算をするメソッド
	public static int addUp(int a, int b) {
		return a + b;
	}

	// 引き算をするメソッド
	public static int subtract(int a, int b) {
		return a - b;
	}

	// 掛け算をするメソッド
	public static int multiply(int a, int b) {
		return a * b;
	}

	// 割り算をするメソッド
	public static int divide(int a, int b) {
		return a / b;
	}

	// 計算結果をコンソールに出力する
	public static void printResult(int result) {
        System.out.println("計算結果は" + result + "です。");
    }

}
