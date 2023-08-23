package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
/*		Q1 下記9個をローカル変数として宣言のみしてください
*		・バイト型・短整数型・整数型・長整数型
*		・単精度浮動小数点数型・倍精度浮動小数点数型
*		・文字型・文字列型・ブーリアン型
*/		
		// バイト型変数 byt を宣言
		byte byt;
		// 短整数型変数 sho を宣言
		short sho;
		// 整数型変数 in を宣言
		int in;
		// 長整数型変数 lon を宣言
		long lon;
		// 単精度浮動小数点変数 flo を宣言
		float flo;
		// 倍精度浮動小数点数型変数 dou を宣言
		double dou;
		// 文字型変数 cha を宣言
		char cha;
		// 文字列型変数 str を宣言
		String str;
		// ブーリアン型変数 boo を宣言
		boolean boo;
		
// 		Q2 それぞれのローカル変数をローカル内でそれぞれの初期値を代入し初期化をしてください
		
		// 上記で宣言した9つの変数にそれぞれのローカル変数毎の初期値を代入
		byt = 0;
		sho = 0;
		in = 0;
		lon = 0l;
		flo = 0.0f;
		dou = 0.0d;
		cha = '\u0000';
		str = null;
		boo = false;
		
/*		Q3 初期化をしたそれぞれの変数に下記の値を代入してください	
*		・バイト型                10  
*	    ・短整数型                100
*	    ・長整数型                10000
*	    ・単精度浮動小数点数型    9.5
*	    ・倍精度浮動小数点数型	  10.5
*	    ・文字型                  a
*	    ・文字列型                ハロー
* 		・ブーリアン型            true
 */
		// 変数 byt に値10を代入
		byt = 10;
		// 変数 sho に値100を代入
	    sho = 100;
	    // 変数 in に値1000を代入
	    in = 1000;
	    // 変数 lon に値10000Lを代入
	    lon = 10000L;
	    // 変数 flo に値9.5fを代入
	    flo = 9.5f;
	    // 変数 dou に値10.5を代入
	    dou = 10.5d;
	    // 変数 cha に文字「a」を代入
	    cha = 'a';
	    // 変数 str に文字列「ハロー」を代入
	    str = "ハロー";
	    // 変数 boo に真偽地trueを代入
	    boo = true;

/*		Q4 下記の通りにコンソール出力されるようにしてください
 * 		上記で作成した変数を必ず使用すること
 * 		11110
 * 		20.0
 * 	    a ハロー true
 * 		11130	
 * 		10000000000					小数点以外の数字を全てかける	
 * 		0.105						10.5割る100をする
 * 		-90							10引く100をする
 */		
	    // 出力結果: 11110
	    System.out.println(byt + sho + in + lon + "\n");
	    // 出力結果: 20.0
	    System.out.println(flo + dou + "\n");
	    // 出力結果: a ハロー true
	    System.out.println(cha + " " + str + " " + boo + "\n");
	    // 出力結果: 11130.0	数字を全て足す
	    System.out.println(byt + sho + in + lon + flo + dou + "\n");
	    // 出力結果: 10000000000	
	    System.out.println(byt * sho * in * lon + "\n");
	    // 出力結果: 0.105
	    System.out.println(dou / sho + "\n");
	    // 出力結果: -90
	    System.out.println(byt - sho + "\n");

/*      Q5 次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
 * 	    「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。
 */
	    // String変数 num をint変数で宣言
	    int num = 20;
	    int num1 = 23;
	    System.out.println("ハローJAVA" + (num + num1) + "\n");
	
/*		Q6 『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください
 * 		好きな食べ物のみインスタンス変数にして、他の項目はローカル変数に代入し○○に入れてください
 *     『山田太郎 18歳 170.5cm 62.2kg 寿司』 
 * 		↓↓format↓↓
 * 	   「初めまして○○です」
 *     「年齢は○○歳です」
 *     「身長は○○cmです」
 *     「体重は○○kgです」
 * 		好きな食べ物は○○です」
 */
	    
	    System.out.println("問6");
	    
		// 山田太郎profile
		// 名前
		String name = "山田太郎";
		// 年齢
		int age = 18;
		// 身長
		double height = 170.5;
		// 体重
		double weight = 62.2;
		// 好きな食べ物
		String favoriteFood = "寿司";
		
		// 自己紹介文
		String profileText = """
				初めまして%sです
				年齢は%s歳です
				身長は%.1fcmです
				体重は%.1fkgです
				好きな食べ物は%sです
				
				""";
		
		// 山田花子の自己紹介文を出力
		System.out.printf(profileText, name, age, height, weight, favoriteFood);
		
		// Q7 Q6で作成した自己紹介に続いてBMIが出力されるようにしてください
		
		System.out.println("問7");
		
		// int型変数 m を宣言、heightの単位を cm から m にするための値100を代入
		int m = 100;
		// int型変数 ro を宣言、BMIの値を小数第一位まで求めるための値10を代入
		int ro = 10;
		// 山田太郎profileを元にBMIを求め、double型変数 bmi に代入
		double bmi = (double)Math.round(weight * (m * m) / (height * height) * ro) / ro;
		// 山田太郎のBMIを出力
		System.out.println(bmi + "\n");
		
/*		Q8 Q6で宣言した変数に再代入し下記の通りコンソールに出力してください
 * 		初めまして鈴木一郎です
 * 		年齢は24歳です
 * 		身長168.5cmです
 * 		体重は64.2kgです
 * 		好きな食べ物はオムライスです
 * 		BMIは22.6です
 */
		
		System.out.println("問8");
		
		// 鈴木一郎profile
		// 名前
		name = "鈴木一郎";
		// 年齢
		age = 24;
		// 身長
		height = 168.5;
		// 体重
		weight = 64.2;
		// 好きな食べ物
		favoriteFood = "オムライス";
		// BMI
		bmi = (double)Math.round(weight * (m * m) / (height * height) * ro) / ro;
		
		System.out.printf(profileText, name, age, height, weight, favoriteFood);
		
		// 鈴木一郎の自己紹介文を出力

/*		Q9 Q6で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、下記の通りコンソールに出力してください
 * 
 * 		初めまして鈴木一郎です
 * 		年齢は48歳です
 * 		身長337.0cmです
 * 		体重は128.4kgです
 * 		好きな食べ物はオムライスです
 * 		BMIは11.31です
 */		
		
		System.out.println("問9");
		
		// 鈴木一郎の年齢・身長・体重を自己代入
		// 年齢
		age += age;
		// 身長
		height += height;
		// 体重
		weight += weight;
		// BMI(小数点第2位(切り上げ)で代入)
		bmi = (double)Math.round(weight * (m * m) / (height * height) * m) / m;
		// 再代入後の鈴木一郎自己紹介を再出力
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" +  weight + "kgです");
		System.out.println("好きな食べ物は" + favoriteFood + "です");
		System.out.println("BMIは" + bmi + "です\n");
		
//		Q10 Q8で使用した年齢が25歳以上ならtrueが出力されるようにしてください。ただしif文は使いません
		
		System.out.println("問10");
		
		// Q8で使用した年齢を再代入
		age = 24;
		// boolean型変数 bo を宣言、参考演算子を用いて25以上ならtrue、そうでないならfalseを代入
		boolean bo = age >= 25 ? true : false;
		// 変数 bo の結果を出力
		System.out.println(bo + "\n");
		
//		Q11 Q8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力してください 
		
		// Q8の【身長・体重】を再代入
		height = 168.5;
		weight = 64.2;
		// Q8の【年齢・身長・体重】を再代入したint型変数 age、height、weightをString型に型変換
		String ageStr = String.valueOf(age);
		String heightStr = String.valueOf(height);
		String weightStr = String.valueOf(weight);
		// String型に型変換した【年齢・身長・体重】を出力
		System.out.println(ageStr + heightStr + weightStr + "\n");
//		Q12 Q11で変換した【年齢・身長】を整数型に変換して出力してください
		
		// Q11で宣言したString型変数 ageStr、heightStr をint型に型変換
		int ageInt = Integer.parseInt(ageStr);
		int heightInt = (int)Double.parseDouble(heightStr);
		// ageInt、heightIntを出力
		System.out.println(ageInt);
		System.out.println(heightInt + "\n");
		
//		Q13 Q12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力してください
//		ただしif文は使わないでください
		
		// booolean型変数 resulut を宣言、三項演算子を用いて変数 ageInt が25もしくは、
		// 変数 heightInt が160以上なら true、そうでないならfalseを代入
		boolean result = ageInt >= 25 || heightInt >= 160 ? true : false;
		// 変数 result の結果を出力
		System.out.println(result);
	}
}
