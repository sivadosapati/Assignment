import java.util.Scanner;

public class Prime {
	public boolean Judgement(int number){
		int i;
		for(i=2;i<=number/2;i++){
			if(number%i==0)
				break;
		}
		if(number<2)
			return false;
		else{
			if(i>number/2)
				return true;
			else
				return false;
		}
	}
	
	public static void main(String[] args) {
		Prime prime = new Prime();
		Scanner in = new Scanner(System.in);
		System.out.println("Please input an integer:");
		int number = in.nextInt();
		if(prime.Judgement(number))
			System.out.println(number+" is a prime.");
		else
			System.out.println(number+" is not a prime.");
		in.close();
	}

}
