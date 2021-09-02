import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailValidation {
	public static boolean emailValidation(String str) {
		String regex="^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";
		Pattern pattern=Pattern.compile(regex);
		return pattern.matcher(str).matches();
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println(emailValidation(sc.nextLine()));
	}
}
