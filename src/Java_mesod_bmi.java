
public class Java_mesod_bmi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printData(29,1.77,65);
				//年齢、身長、体重（引数）
	}
	public static void printData(int age,double height,double weight) {
				//public staticデータ型、メソッド名、仮引数、仮引数
				
			System.out.println("年齢は"+age+"です");
									//変数age
			System.out.println("身長は"+height+"です");
									//変数height
			System.out.println("体重は"+weight+"です");
									//変数weight
			double BMI=bmi(height,weight);
			
			System.out.println("BMIは"+BMI+"です");
									//変数BMI
	}
	public static double bmi(double height,double weight){
			//public static　メソッド名、仮引数、仮引数
			return weight/height/height;//BMIの計算式
	}
		
		

	


	}


