package Surprises;

import java.util.ArrayList;

import Interfaces.ISurprise;

public class MinionToy implements ISurprise{
	
	@Override
	public String toString() {
		return "toy minion " + currentMinion;
	}

	private String currentMinion;
	private static int minionOrder;
	
	public void enjoy() {
		System.out.println("Enjoy your minion toy " + this.currentMinion + "!");
	}
	
	private static final ArrayList<String> minions = new ArrayList<String> () {
			{
				add("Bob"); 
				add("Frank"); 
				add("Phil"); 
				add("Tom"); 
				add("Larry"); 
				add("Chris");
			}
	};
	
	public MinionToy(int minionOrder) {
		
		this.currentMinion = this.minionOrdering(minionOrder);
		
	}
	
	private String minionOrdering(int minionOrder) {
		
		if(MinionToy.minionOrder > 5) {
			MinionToy.minionOrder = 0;
		}
		
		switch(MinionToy.minionOrder) {
			case 0:
				this.currentMinion = MinionToy.minions.get(0);
				break;
			case 1:
				this.currentMinion = MinionToy.minions.get(1);
				break;
			case 2:
				this.currentMinion = MinionToy.minions.get(2);
				break;
			case 3:
				this.currentMinion = MinionToy.minions.get(3);
				break;
			case 4:
				this.currentMinion = MinionToy.minions.get(4);
				break;
			case 5:
				this.currentMinion = MinionToy.minions.get(5);
				break;
		}
		MinionToy.minionOrder++;
		return this.currentMinion;
	}
	
	public static MinionToy generate() {

		MinionToy toy = new MinionToy(MinionToy.minionOrder);
		return toy;
		
	}
}
