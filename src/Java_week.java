
public class Java_week {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] week= {
				"月","火","水","木","金","土","日",
		};
		String[] english= {
				"monday","tueseday","wednesday","thursday","friday","saturday","sunday",
		};
		for(int i=0 ; i < 7; i++ ) {
			System.out.println(week[i]+"曜日は英語では"+english[i]+"です");
		}

	}

}
