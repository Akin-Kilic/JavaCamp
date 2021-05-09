package eticaret.adapters.concretes;

import eticaret.adapters.abstracts.EMailValidatorService;
import eticaret.emailValidator.EMailValidator;

public class EMailValidatorManager implements EMailValidatorService{

	@Override
	public boolean isEMailValid(String emailInput) {
		EMailValidator eMailValidator = new EMailValidator();
		return eMailValidator.isEmailVaild(emailInput);
	}

}
