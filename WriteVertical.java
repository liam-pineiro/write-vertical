package writeVertical;

public class WriteVertical {
	
	public static void main(String[ ] args) {
		writeVertical(7);
		writeVertical(97);
		writeVertical(-97);
	}
	
	public static void writeVertical(int number) {
		if(number < 0) {
			System.out.println("-");
			writeVertical(-1*number);
		}
		else {
			if(number < 10) {
				//Single digit base case
				System.out.println(number);
			}
			else {
				writeVertical(number/10);
				System.out.println(number % 10);
			}
		}
	}
}
