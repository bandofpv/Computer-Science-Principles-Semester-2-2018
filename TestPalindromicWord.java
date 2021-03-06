import java.util.Scanner;

public class TestPalindromicWord {
	public static void main(String[] args) {
		String inStr;        // input String
		int inStrLen;
		int count = 0;


		Scanner in = new Scanner(System.in);
		System.out.print("Enter a String: ");
		inStr = in.next();   // use next() to read a String
		inStr = inStr.toLowerCase();
		inStrLen = inStr.length();

		int fIdx = 0, bIdx = inStrLen -1;
		while (fIdx < bIdx) {
			char f = inStr.charAt(fIdx);
			char e = inStr.charAt(bIdx);

			if (f == e) {
				fIdx++;
				bIdx--;
				count = 1;
			}
			else {
				count = 0;
				break;
			}
		}

		if(count == 1) {
			System.out.print(inStr + " is a palindromic");
		}
		
		else {
			System.out.print(inStr + " is not palindromic");
		}

	}

}
