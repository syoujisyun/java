import java.util.Random;
import java.util.Scanner;

public class Java_s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] kuji = {"��g","�g","�勥",};
		Random r = new Random();
		
		String kujibiki = kuji[r.nextInt(3)];
		//System.out.println(kujibiki);
		

	Scanner scanner = new Scanner(System.in);
	
	System.out.println("���O����͂��Ă�������");
	
	String input_text = scanner.nextLine();
	
	System.out.println(input_text+"����̍����̂��݂����̌��ʂ�"+kujibiki+"�ł�");
	
	
	}
}
