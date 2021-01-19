import java.util.Random;
import java.util.Scanner;

public class Java_janken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] hands= {"グー","チョキ","パー",};
		Random r =new Random();//ランダム
		
		String hand=hands[r.nextInt(3)];
		
		Scanner scanner=new Scanner(System.in);//スキャナー
		
		System.out.println("入力してください");//入力を促す
		
		String input_text=scanner.nextLine();
		
		System.out.println("あなたは"+input_text+"を出しました");//入力された内容を出力
			
			System.out.println(hand);
			
			String 0 = "グー";
			String 1 ="チョキ";
			String 2 ="パー";
			
			if(0=="パー" && 1=="グー"&& 2=="チョキ") {
				System.out.println("あなたの負けです");
				
			}else if(a=="チョキ"&& b=="パー"&& c=="グー") {
			System.out.println("あなたの勝ちです");
			
		}else {
			System.out.println("あいこです");
		}
		

	}
}


