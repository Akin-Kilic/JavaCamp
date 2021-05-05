package Adapters;

import java.rmi.RemoteException;

import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapters implements Absract.CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(Long.valueOf(customer.getNationalityId()),
					customer.getCustomerName().toUpperCase(), customer.getCustomerLastName().toUpperCase(),
					customer.getDateOfBirth());
		} catch (RemoteException e) {

			e.printStackTrace();
		}
		return false;
	}

}
