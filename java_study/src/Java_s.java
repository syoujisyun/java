import java.util.Random;
import java.util.Scanner;

public class Java_s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] kuji = {"‘å‹g","‹g","‘å‹¥",};
		Random r = new Random();
		
		String kujibiki = kuji[r.nextInt(3)];
		//System.out.println(kujibiki);
		

	Scanner scanner = new Scanner(System.in);
	
	System.out.println("–¼‘O‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
	
	String input_text = scanner.nextLine();
	
	System.out.println(input_text+"‚³‚ñ‚Ì¡“ú‚Ì‚¨‚İ‚­‚¶‚ÌŒ‹‰Ê‚Í"+kujibiki+"‚Å‚·");
	
	
	}
}
