import java.util.Scanner;

public class FindA {
	public void Find_A(){
		System.out.println("Please input a work or sentence:");
		Scanner in = new Scanner(System.in);
		String content = in.nextLine();
		in.close();
		int i,j=0;
		for(i=0;i<content.length();i++){
			String letter = content.substring(i, i+1);
			if(letter.equals("a"))
				j++;
		}
		if(j!=0)
			System.out.println("'"+content+"'"+" has "+j+" 'a'.");
		else
			System.out.println("'"+content+"'"+" has no 'a'.");
	}
	
	public static void main(String[] args) {
		FindA finda = new FindA();
		finda.Find_A();
	}

}
