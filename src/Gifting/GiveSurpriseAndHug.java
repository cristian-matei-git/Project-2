package Gifting;

public class GiveSurpriseAndHug extends AbstractGiveSurprises {

	@Override
	void giveWithPassion() {
		
		System.out.println("Warm wishes and a big hug!");

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

	public GiveSurpriseAndHug(String containerType, int waitTime) {
		
		super(containerType, waitTime);
		
	}
	
	

}
