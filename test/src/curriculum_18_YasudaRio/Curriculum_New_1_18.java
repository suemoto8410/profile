package curriculum_18_YasudaRio;

import java.util.ArrayList;
import java.util.Random;

public class Curriculum_New_1_18 {
	
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	/****************************
	 * 「Hello JavaSE 11」を出力するメソッド
	 ****************************/
	public static void message (String message , int num) {
		
		// 受け取った引数をコンソールに出力
		System.out.println(message + "\s" + num + "\n");
		
	}
	
	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	/****************************
	 * 乗算した値を出力するメソッド
	 ****************************/
	public static void calculation (int mul1 , int mul2) {
		
		// 乗算した値をコンソールに出力
		System.out.println(mul1 * mul2 + "\n");
		
	}
		
	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	/****************************
	 * 受け取った値を順番にコンソールに出力するメソッド
	 ****************************/
	public static void numbers (int[] nums) {
		
		// 受け取った値全てコンソールに出力する処理
		for (int num : nums) {
			
			// 受け取った値全てコンソールに出力
			System.out.print(num + "\s");
			
		}
		
	}
			

	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	/****************************
	 * 引数同士を和算しコンソールに出力するメソッド
	 ****************************/
	public static void calculation (double sum1 , double sum2) {
		
		// 受け取った値の合計を変数に格納
		double sum = sum1 + sum2;
		// コンソールに和算した値を出力
		System.out.println("\n" + "\n" + sum + "\n");
		
	}
		
	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	/****************************
	 * 引数同士を和算しコンソールに出力するメソッド
	 ****************************/
	public static ArrayList<Integer> randomNum (int num ) {
		
		// ランダムインスタンスを作成
		Random rand = new Random();
		// 配列を宣言
		ArrayList<Integer> list = new ArrayList<>();
		
		// 引数に受け取った値だけ繰り返す処理
		for (int i = 0; i < num; i++) {
			
			// 1～100までのランダムな数字作成 
			int rNum = rand.nextInt(100) + 1;
			// 配列に作成した数字を追加
			list.add(rNum);
				
		}
		
		// コンソールに配列を出力
		System.out.println(list + "\n");
		// 配列を呼び出しもとに返す
		return list;
		
	}

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	/****************************
	 * Q5の配列の平均値をコンソールに出力するメソッド
	 ****************************/
	public static double avg () {
		
		// Q5の配列を受け取って変数に格納
		ArrayList<Integer> list = randomNum(20);
		// 合計値を格納する変数を宣言
		int sum = 0;
		
		// 配列の合計を得る処理
		for (int num : list) {
			
			// 配列の値全てを足す
			sum += num;
			
		}
		
		// 平均値を求めて変数に格納
		double avg = (double) sum / list.size();
		// 平均値をコンソールに出力
		System.out.println(avg);
		// 平均値を呼び出し元に返す
		return avg;
		
	}
	

	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	/****************************
	 * Q6の平均値が50より大きいか小さいか判断する処理
	 ****************************/
	public static void judgment () {
		
		// 	Q5の平均値を変数に格納
		double num = avg ();
		// 平均値が50より大きいか小さいかの判断を変数に格納
		boolean judge = num >= 50;
		// 判定結果をコンソールに出力
		System.out.println("" + judge);
		
	}
	
	
	public static void main(String[] args) {
    // 作成したメソッドをここで呼び出してください
		
		// Q1メソッド呼び出し
		message("Hello JavaSE",11); 
		
		// Q1メソッド呼び出し
		calculation(2 , 5);
		
		// 引数に入れる配列作成
		int[] num = {1,2,3,4,5,6,7,8,9};
		// Q3メソッド呼び出し
		numbers(num);
		
		// Q4メソッド呼び出し
		calculation(2.5,7.8);
		
		// Q5メソッド呼び出し
		randomNum(20);
		
		// Q6メソッド呼び出し
		avg();
		
		// Q7メソッド呼び出し
		judgment();
	
	}

}
