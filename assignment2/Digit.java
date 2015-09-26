import java.util.Scanner;

public class Digit {
	public void CountDigit(){
		Scanner in = new Scanner(System.in);
		System.out.println("Please input an integer:");
		int number = in.nextInt();
		System.out.print(number);
		int i;
		for(i=1;;i++){
			if(number/10!=0){
				number=number/10;
				continue;
			}
			else
				break;
		}
		System.out.println(" has "+i+" digits.");
		in.close();
	}
	public static void main(String[] args) {
		Digit digit = new Digit();
		digit.CountDigit();
	}

}
