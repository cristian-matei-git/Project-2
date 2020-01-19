package Bag;

import java.util.ArrayList;
import Interfaces.IBag;
import Interfaces.ISurprise;

public abstract class AbstractBag implements IBag{
	
	public final ArrayList<ISurprise> surprise = new ArrayList<ISurprise>();
	
	@Override
	public void put(ISurprise newSurprise) {
		
		surprise.add(newSurprise);
		
	}
	
	@Override
	public String toString() {
		return " " + this.surprise;
	}



	@Override
	public void put(IBag bagOfSurprises) {
		
		for(int i = 0; i < bagOfSurprises.size(); i++) {
			if(!bagOfSurprises.isEmpty()) {
				surprise.add(bagOfSurprises.takeOut());
			}
		}
	}

	@Override
	public boolean isEmpty() {
		
		return surprise.isEmpty();
		
	}

	@Override
	public int size() {
		
		return surprise.size();
		
	}

}
