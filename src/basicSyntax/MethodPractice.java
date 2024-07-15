package basicSyntax;

public class MethodPractice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 10;
	    int b = 5;

	    int addUpResult = addUp(a,b);
	    int subtractResult = subtract(a,b);
	    int multiplyResult = multiply(a,b);
	    int divideResult = divide(a,b);

	    System.out.println("足し算の計算結果は" + addUpResult + "です。");
	    System.out.println("引き算の計算結果は" + subtractResult + "です。");
	    System.out.println("掛け算の計算結果は" + multiplyResult + "です。");
	    System.out.println("割り算の計算結果は" + divideResult + "です。");
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
	
}
