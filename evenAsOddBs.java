package example1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class evenAsOddBs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "aabcccccdddddddd";
		String regex = "((?=b*ab*ab*)*(?=a*ba*ba*)*(a*ba*))"
				+ "(c|d)*|(cbadcbad)*";
		
		
		Pattern pattern = Pattern.compile(regex);
		
		Matcher matcher = pattern.matcher(s);
		
		System.out.print(s + " " + matcher.matches());

	}

}
