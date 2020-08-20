package day01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println();

		// 状況に応じて指し示すデータが変わるのが変数
		System.out.println("蘇我馬子は日本の飛鳥時代の政治家・貴族。蘇我氏全盛時代を築いた。");
		String he = "蘇我馬子";
		System.out.println(he + " is my friend.");

		System.out.println("菅原道真は日本の平安時代の政治家・学者・貴族。左遷された。北野天満宮に祀られている。");
		he = "菅原道真";
		System.out.println(he + " is my friend.");

		// 反対に，いかなる時でもデータが変わらないのが定数
		final String KCG = "京都コンピュータ学院";
		System.out.println(KCG + "　is Japan’s first computer education institute.");
		final float PI = 3.14f;
		System.out.println("Pi is " + PI + ".");

		// PI = 3.0f; // 一昔前に円周率は3と習う時期がありました
		// he = 845; // 菅原道真は845年生まれらしい。だが，人の名前を表す変数で生年を表すのは変だよね。だからJavaではできない。
		int hisYearOfBirth = 845; // 生年（整数）としてデータを保持するなら納得
		System.out.println(he + " was born in " + hisYearOfBirth + ".");

		// 計算をしよう
		int allowance = 587 + 2000; // 高校時代は月2000円の小遣い(MonthlyAllowance)で生活していました
		allowance = allowance - 484; // 呪術廻戦12巻を買ったようです
		double taxInclueded = 440 * 1.1; // 呪術廻戦12巻は440円+税です
		double discountedPrice = 1500 / 0.7; // シャツが割引されてました

		// type casting のお話し
		int costOfFood = 2983;
		System.out.println(costOfFood);
		// デートの食事代を二人で割り勘
		double costPerPerson = (double)costOfFood / 2;
		System.out.println(costPerPerson);
		System.out.println(costPerPerson * 2);


		// ICカードの価格を比較
		int balance = 300;
		String gettingOnStation = "京都";
		String gettingOffStation = "草津";
		int fare = 420; // 運賃

		if(fare <= balance) {
			balance -= fare;
			System.out.println("残高は" + balance + "円です。");
		} else {
			System.err.println("運賃が足りません。チャージしてください。");
		}

		boolean isAdmin = true;
		String userType = isAdmin ? "管理者" : "一般";


		// 配列
		String[] stationNames = {"京都", "山科", "大津", "膳所", "石山", "瀬田", "南草津", "草津"};

		if (gettingOnStation == "京都") {
			System.out.println("==");
		} else if (gettingOnStation.equals("京都")) {
			System.out.println("equals()");
		}

		SmartPhone smartPhone = new SmartPhone();

		boolean 欲しいキャラが出ない = true;
		String gameTitle = "パケットモンスター";
		String wantCharactor = "ミョウ２";
		while(欲しいキャラが出ない) {
			smartPhone.install( new App(gameTitle) );
			App app = smartPhone.play(gameTitle);
			String charactorName = app.gacha();
			if(charactorName.equals(wantCharactor)) 欲しいキャラが出ない = false;
			else smartPhone.uninstall(app);
		}
		// ゲームの続きができる


		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}


	}

}
