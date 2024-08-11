package objectExercise;

public class Main {

	public static void main(String[] args) {
		// 4. 呼び出す時はインスタンスの生成時に値を設定
	    // ここでインスタンスフィールドに値を設定するだけ
		Apartment apartment = new Apartment("いい感じアパートメント","山田 マンション太郎",50000000,"3LDK");
		apartment.greeting();
		
		Land land = new Land("いい感じの土地","山田 土地太郎",8000000,105.2);
		land.greeting();
	}
}
