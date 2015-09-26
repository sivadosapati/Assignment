import java.util.Scanner;

public class FindLetter {
	public void Find_Letter(){
		System.out.println("Please input a work or sentence:");
		Scanner in = new Scanner(System.in);
		String content = in.nextLine();
		System.out.println("Please input the letter you want to check:");
		String letter = in.next();
		in.close();
		int i,j=0;
		for(i=0;i<content.length();i++){
			String seperation = content.substring(i, i+1);
			if(seperation.equals(letter))
				j++;
		}
		if(j!=0)
			System.out.println("'"+content+"'"+" has "+j+" '"+letter+"'.");
		else
			System.out.println("'"+content+"'"+" has no '"+letter+"'.");
	}
	
	public static void main(String[] args) {
		FindLetter finda = new FindLetter();
		finda.Find_Letter();
	}
}