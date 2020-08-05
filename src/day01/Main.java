package day01;

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

		// PI = 3.0f; // 一昔前に円周率は3という時期がありました
		// he = 845; // 菅原道真は845年生まれらしい。だが，人の名前を表す変数で生年を表すのは変だよね。だからJavaではできない。
		int hisYearOfBirth = 845; // 生年（整数）としてデータを保持するなら納得
		System.out.println(he + " was born in " + hisYearOfBirth + ".");
	}
}
