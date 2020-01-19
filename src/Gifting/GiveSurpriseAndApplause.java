package Gifting;

public class GiveSurpriseAndApplause extends AbstractGiveSurprises {

	@Override
	void giveWithPassion() {
		
		System.out.println("Loud applause to you... For it is in giving that we receive.");

	}

	@Override
	public void give() {
		
		super.give();
		if(!super.getBag().isEmpty()) {
			giveWithPassion();
		}
	}

	@Override
	public void giveAll() {
	
		super.giveAll();
		giveWithPassion();
		
	}

	public GiveSurpriseAndApplause(String containerType, int waitTime) {
		super(containerType, waitTime);
		
	}
	
	

}
