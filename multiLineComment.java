package example1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class multiLineComment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String e = "/*this*/";
		String regex = "/\\*.*?\\*/";
		
		
		Pattern pattern = Pattern.compile(regex);
		
		Matcher matcher = pattern.matcher(e);
		
		System.out.print(e + " " + matcher.matches());
		
	}

}
