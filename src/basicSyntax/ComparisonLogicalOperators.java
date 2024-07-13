package basicSyntax;

public class ComparisonLogicalOperators {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 5;
		int b = 3;
		boolean isGreaterA = (a > b);
		System.out.println(isGreaterA);

		boolean isSunny = true;
		boolean isWarm = true;
		if (isSunny && isWarm) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		int x = 5;
		int y = 10;
		if (x >= 0 && y % 2 == 0) {
			System.out.println("true");
		}

		boolean hasPermission = false;
		if (!hasPermission) {
			System.out.println("true");
		}

	}

}
