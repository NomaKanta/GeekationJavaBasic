package objectExercise;

public class Apartment extends Property {
	private String floor;//間取りを定義する

	Apartment(String name, String owner, int price, String floor) {
		super(name, owner, price);
		this.floor = floor;
	}

	// floorのゲッター
	public String getFloor() {
		return this.floor;
	}

	// floorのセッター
	public void setFloor(String floor) {
		this.floor = floor;
	}

	// ApartmentクラスでPropertyクラスのgreetingメソッドを上書き
	public void greeting() {
		//スーパークラスのコンストラクタを呼び出す
		super.greeting();
		// floorフィールドを使って、出力処理を追加する
		System.out.println("間取り：" + this.floor);
		System.out.println("=============================");
	}
}
