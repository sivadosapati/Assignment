import java.util.Scanner;

public class MaxNumber {
	public void FindMaxNumber(){
		System.out.println("Please input series numbers:");
		Scanner in = new Scanner(System.in);
		int max=0;
		for(;;){
			String input=in.next();
			if(input.equals("#"))
				break;
			else{
				int number = Integer.parseInt(input);
				if(max<number)
					max=number;
			}
		}
		in.close();
		System.out.println("The max number is "+max+".");
	}
	public static void main(String[] args) {
		MaxNumber maxnumber = new MaxNumber();
		maxnumber.FindMaxNumber();
	}

}
