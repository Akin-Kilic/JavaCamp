package eticaret.core.concretes;

import eticaret.core.abstracts.RegisterService;
import eticaret.googleRegister.GoogleRegisterManager;

public class GoogleRegisterManagerAdapter implements RegisterService{

	@Override
	public void registerWithGoogle() {
		GoogleRegisterManager googleRegisterManager = new GoogleRegisterManager();
		googleRegisterManager.register();
		
	}
	
}
