import java.util.Scanner;

public class MaxMinNumber {
	public void FindMaxMinNumber(){
		System.out.println("Please input series numbers:");
		Scanner in = new Scanner(System.in);
		int max=0;
		int min=0;
		for(;;){
			String input=in.next();
			if(input.equals("#"))
				break;
			else{
				int number = Integer.parseInt(input);
				if(max<number)
					max=number;
				if(min>number)
					min=number;
			}
		}
		in.close();
		System.out.println("The maximum number is "+max+", and the minimum number is "+min+".");
	}
	public static void main(String[] args) {
		MaxMinNumber maxminnumber = new MaxMinNumber();
		maxminnumber.FindMaxMinNumber();

	}

}
