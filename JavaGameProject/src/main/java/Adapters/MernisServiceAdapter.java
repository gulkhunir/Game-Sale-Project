package Adapters;

import java.rmi.RemoteException;

import Abstract.PlayerCheckService;
import Entities.Players;
import tr.gov.nvi.tckimlik.WS.*;

public class MernisServiceAdapter implements PlayerCheckService{
		public boolean result;
	@Override
	public boolean checkIfRealPerson(Players player) {
		KPSPublicSoapProxy client= new KPSPublicSoapProxy();
		try {
			return result= client.TCKimlikNoDogrula(Long.parseLong(player.getNationalId()), player.getFirstName(), player.getLastName(), player.getYearOfBirth());
		}catch(NumberFormatException|RemoteException e){
			System.out.println("e");
			e.printStackTrace();
		}
		return result;
	}
}