import java.util.Scanner;

public class Java_scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

	    // 入力を促すメッセージ
	    System.out.print("入力してください > ");

	    //入力された内容をインスタンスから取得
	    //数値の時はnextInt
	    //文字列の時はnextLine
	    String input_text = scanner.nextLine();

	    //入力された内容を画面に表示
	    System.out.println(input_text + "が入力されました");

	    // Scannerクラスのインスタンスをクローズ
	    scanner.close();

	}

}
