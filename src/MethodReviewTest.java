import java.util.Scanner;
public class MethodReviewTest {
	public static void main(String[] args) {
	printFeverLimits();

	Scanner myScanner = new Scanner(System.in);
	System.out.println("Subject");
	String subject = myScanner.nextLine();
	System.out.println("Temperature");
	int temp = myScanner.nextInt();
	
	MethodReviewTest obj = new MethodReviewTest();
	boolean hasFever = obj.hasFeverMethod(subject, temp);
	if(hasFever) {
		System.out.println("The subject has fever");
	}else {
		System.out.println("The subject has no fever");
	}
	
}

	public static void printFeverLimits() {
		System.out.println("Fever limits");
		System.out.println("- human 37");
		System.out.println("- dog 39");
		System.out.println("- horse 38");
		
	}
	
	public boolean hasFeverMethod(String subject, int temp) {
		if(subject.equals("human") && temp > 37) {
			return true;
		}else if(subject.equals("dog")&& temp > 39) {
			return true;
		}else if(subject.equals("horse") && temp > 38) {
			return true;
		}else {
			return false;
		}
	}
}
