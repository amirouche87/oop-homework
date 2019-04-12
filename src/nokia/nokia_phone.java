package nokia;

public class nokia_phone extends TelecomAbstract implements telecomeinterface {

	@Override
	public void enterPhoneNumber() {
		// TODO Auto-generated method stub
		System.out.println("hit on the logo to enter phone number");
	}

	@Override
	public void enterTextMsg() {
		// TODO Auto-generated method stub
		System.out.println("look for the icone text and click on it to enter text msg");
	}

	@Override
	public void videoCall() {
		// TODO Auto-generated method stub
		System.out.println("look for the video icone and click on it in order t procced to a video call");
	}

	@Override
	public void answerCall() {
		// TODO Auto-generated method stub
		System.out.println("slid the green field to answer the call");
	}

	@Override
	public void hangUp() {
		// TODO Auto-generated method stub
		System.out.println("click on the red field to end the call and hangup");
	}
	public void viberAPP(int phoneNumber) {
		super.viberAPP(phoneNumber);
		
	}
	public void skypeAPP(int phoneNumber)
			{	super.skypeAPP(phoneNumber);
			}
	public void skypeAPP(int phoneNumber, int contact)
	{System.out.println("calling number");
		
	}
	public void internetConnexion(String URL)
	{super.internetConnexion(URL);
	}
	
	
	
	
	
	
}

