package studyweek;

public class flowers {
	public static void main(String[] args) {
		String[] flowers = { "lot", "lily", "rose", "jasmine" };
		for (String c : flowers) {
			if (c.length() < 4) {
				continue;
				
				
			}
			System.out.print(c + " ");
			
			if (c.length() == 4) {
				break;
			}
		}
	}
}
