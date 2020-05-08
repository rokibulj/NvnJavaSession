package all.practice;

public class SwitchCaseStatement {

	public static void main(String[] args) {

		int num = 9;

		switch (num) {
		case 0:
			System.out.println("num is 0");

			break;

		case 1:
			System.out.println("num is1");

			break;

		case 4:
			System.out.println("num is 4");

			break;

		case 9:
			System.out.println("num is 9");

			break;

		case 10:
			System.out.println("num is 10");

			break;

		default:
			System.out.println("Number is not found");
			break;
		}

		int day = 5;

		switch (day) {

		case 0:
			System.out.println("Monday");
			break;
		case 1:
			System.out.println("Tuesday");
			break;

		case 2:
			System.out.println("Wednesday");
			break;

		case 3:
			System.out.println("Thursday");
			break;

		case 4:
			System.out.println("Friday");
			break;

		case 5:
			System.out.println("Saturday");
			break;

		case 6:
			System.out.println("Sunday");
			break;

		default:
			System.out.println("Day not found");
			break;
		}
		
		String browser = "chrome";
		
		switch (browser) {
		
		case "chrome":
			System.out.println("launch chrome");
			break;
			
		case "firefox":
			System.out.println("launch firefox");
			break;
			
		case "ie":
			System.out.println("launch ie");
			break;
			
		case "safari":
			System.out.println("launch safari");
			break;
			
		case "opera":
			System.out.println("launch opera");
			break;
			
		case "headless":
			System.out.println("launch headless");
			break;
			
			

		default:
			System.out.println("browser not found");
			break;
		}
		
	
	}

}
