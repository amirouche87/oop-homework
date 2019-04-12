package nokia;

public abstract class TelecomAbstract {
	public void viberAPP(int phoneNumber)
	{System.out.println("calling a number"+phoneNumber+"using viberAPP");
		}
	public void skypeAPP(int phoneNumber) {
		System.out.println("calling a number"+phoneNumber+"using skypeAPP");
	}
public void internetConnexion(String URL) 
{
System.out.println("connect to facebook and snapchat and tweeter "+URL+" with internetConnection");
}
}
