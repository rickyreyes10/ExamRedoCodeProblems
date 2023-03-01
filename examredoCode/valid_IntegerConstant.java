package example1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class valid_IntegerConstant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String i = "4000000024u";
		String regex = "([0-9]|[1-9][0-9]*|[0-7]+|0[xX][0-9a-fA-F]+)(i64|I64|u|U|I|L)?";
		
		
		Pattern pattern = Pattern.compile(regex);
		
		Matcher matcher = pattern.matcher(i);
		
		System.out.print(i + " " + matcher.matches());
		
	}

}
