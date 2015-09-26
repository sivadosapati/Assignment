import java.util.Scanner;

public class EvenNumber {
	public void FindEven(){
		Scanner in = new Scanner(System.in);
		System.out.println("Please input an integer:");
		int number = in.nextInt();
		if(number>=2){
			System.out.println("Even numbers from 2 to "+number+" include: ");
			for(int i=2;i<=number;i+=2){
				System.out.printf("%-7s",i+" ");
				if(i%50==0)
					System.out.println("");
			}
		}
		else
			System.out.println("WRONG INPUT.");
		in.close();
	}
	
	public static void main(String[] args) {
		EvenNumber evennumber = new EvenNumber();
		evennumber.FindEven();
	}
}
