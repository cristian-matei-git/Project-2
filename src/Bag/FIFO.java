package Bag;

import Interfaces.ISurprise;

public class FIFO extends AbstractBag{

	@Override
	public ISurprise takeOut() {
		
		ISurprise firstInFirstOut = surprise.get(0);
		surprise.remove(0);
		return firstInFirstOut;
		
	}

	@Override
	public String toString() {
		return "FIFO and it contains" + super.toString();
	}
	
}
