package example1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class valid_MethodOrClassOrVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String example = "valid_MethodOrClassOrVar";
		
		String Mregex = "^[a-zA-Z_$][a-zA-Z\\d_$]*\\(\\)$";
		String Cregex = "^[A-Z][a-zA-Z\\d]*$";
		String Vregex = "^[a-zA-Z_$][a-zA-Z\\d_$]*$";
		
		Pattern pattern = Pattern.compile(Cregex);
		
		Matcher matcher = pattern.matcher(example);
		
		System.out.print(example + " " + matcher.matches());
	
	}

}
