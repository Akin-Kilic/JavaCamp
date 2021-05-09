package eticaret.emailValidator;

import java.util.regex.Pattern;

public class EMailValidator {
	private final String eMailPattern = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
	public boolean isEmailVaild(String emailInput) {
		Pattern pattern = Pattern.compile(eMailPattern, Pattern.CASE_INSENSITIVE);
		return pattern.matcher(emailInput).find();
	}
}
