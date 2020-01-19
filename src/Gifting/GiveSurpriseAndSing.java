package Gifting;

public class GiveSurpriseAndSing extends AbstractGiveSurprises {

	@Override
	void giveWithPassion() {
		
		System.out.println("Singing a nice song, full of joy and genuine excitement...");

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

	public GiveSurpriseAndSing(String containerType, int waitTime) {
		
		super(containerType, waitTime);
		
	}
	
	

}
