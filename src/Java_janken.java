import java.util.Random;
import java.util.Scanner;

public class Java_janken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] hands= {"�O�[","�`���L","�p�[",};
		Random r =new Random();//�����_��
		
		String hand=hands[r.nextInt(3)];
		
		Scanner scanner=new Scanner(System.in);//�X�L���i�[
		
		System.out.println("���͂��Ă�������");//���͂𑣂�
		
		String input_text=scanner.nextLine();
		
		System.out.println("���Ȃ���"+input_text+"���o���܂���");//���͂��ꂽ���e���o��
			
			System.out.println(hand);
			
			String 0 = "�O�[";
			String 1 ="�`���L";
			String 2 ="�p�[";
			
			if(0=="�p�[" && 1=="�O�["&& 2=="�`���L") {
				System.out.println("���Ȃ��̕����ł�");
				
			}else if(a=="�`���L"&& b=="�p�["&& c=="�O�[") {
			System.out.println("���Ȃ��̏����ł�");
			
		}else {
			System.out.println("�������ł�");
		}
		

	}
}


