import java.util.Scanner;

public class Java_scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

	    // ���͂𑣂����b�Z�[�W
	    System.out.print("���͂��Ă������� > ");

	    //���͂��ꂽ���e���C���X�^���X����擾
	    //���l�̎���nextInt
	    //������̎���nextLine
	    String input_text = scanner.nextLine();

	    //���͂��ꂽ���e����ʂɕ\��
	    System.out.println(input_text + "�����͂���܂���");

	    // Scanner�N���X�̃C���X�^���X���N���[�Y
	    scanner.close();

	}

}
