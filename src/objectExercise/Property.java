package objectExercise;

public class Property {
	// 1. インスタンスフィールドを定義
	private String name;
	private String owner;
	private int price;

	// 2. コンストラクタの引数にインスタンスフィールドを渡す
	Property(String name, String owner, int price) {
		// 3. `this.インスタンスフィールド名 = インスタンスフィールド名`の形で設定
		this.name = name;
		this.owner = owner;
		this.price = price;
	}

	// nameのゲッター
	public String getName() {
		return this.name;
	}

	// ownerのゲッター
	public String getOwner() {
		return this.owner;
	}

	// priceのゲッター
	public int getPrice() {
		return this.price;
	}

	// nameのセッター
	public void setName(String name) {
		this.name = name;
	}

	// ownerのセッター
	public void setOwner(String owner) {
		this.owner = owner;
	}

	// priceのセッター
	public void setPrice(int price) {
		this.price = price;
	}

	public void greeting() {
		System.out.println("=============================");
		System.out.println("物件名：" + this.name);
		System.out.println("物件所有者：" + this.owner);
		System.out.println("物件価格：" + this.price + "円");
	}
}
