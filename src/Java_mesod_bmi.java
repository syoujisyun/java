
public class Java_mesod_bmi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printData(29,1.77,65);
				//�N��A�g���A�̏d�i�����j
	}
	public static void printData(int age,double height,double weight) {
				//public static�f�[�^�^�A���\�b�h���A�������A������
				
			System.out.println("�N���"+age+"�ł�");
									//�ϐ�age
			System.out.println("�g����"+height+"�ł�");
									//�ϐ�height
			System.out.println("�̏d��"+weight+"�ł�");
									//�ϐ�weight
			double BMI=bmi(height,weight);
			
			System.out.println("BMI��"+BMI+"�ł�");
									//�ϐ�BMI
	}
	public static double bmi(double height,double weight){
			//public static�@���\�b�h���A�������A������
			return weight/height/height;//BMI�̌v�Z��
	}
		
		

	


	}


