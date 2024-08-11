package objectExercise;

public class Land extends Property {
	private double breadth;//広さを定義する

	Land(String name, String owner, int price, double breadth) {
		super(name, owner, price);
		this.breadth = breadth;
	}

	// breadthのゲッター
	public double getBreadth() {
		return this.breadth;
	}

	// breadthのセッター
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	// LandクラスでPropertyクラスのgreetingメソッドを上書き
	public void greeting() {
		//スーパークラスのコンストラクタを呼び出す
		super.greeting();
		// breadthフィールドを使って、出力処理を追加する
		System.out.println("広さ：" + this.breadth + "㎡");
		System.out.println("=============================");
	}
}
