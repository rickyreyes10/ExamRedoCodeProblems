package example1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Valid_Email {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String email = "rickyr2@gmail.com";
		String regex = "([^.]+.[[a-zA-z]|[0-9]|[!#$%&’*+/=?`{|}~^-]]+|[[a-zA-z]|[0-9]|[!#$%&’*+/=?`{|}~^-]]+)+@"
				+ "([^-.]+|[^-.][^.]*[^-.]).([^-.]+|[^-.][^.]*[^-.])";
		
		
		Pattern pattern = Pattern.compile(regex);
		
		Matcher matcher = pattern.matcher(email);
		
		System.out.print(email + " " + matcher.matches());
		

	}
	

}
