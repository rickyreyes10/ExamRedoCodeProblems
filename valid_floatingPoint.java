package example1;

import java.util.regex.Matcher; 
import java.util.regex.Pattern;

public class valid_floatingPoint {

	public static void main(String[] args) {
		
		
		String f = "0e+10";
		String regex = "[+-]?([0-9]*.[0-9]|[0-9]+.)([eE][+-]?[0-9]+)?[LIFf]?|[+-]?[0-9]+[eE][+-]?[0-9]+[LIFf]?";
		
		
		Pattern pattern = Pattern.compile(regex);
		
		Matcher matcher = pattern.matcher(f);
		
		System.out.print(f + " " + matcher.matches());

	}

}
