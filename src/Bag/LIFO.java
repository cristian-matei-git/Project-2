package Bag;

import Interfaces.ISurprise;

	public class LIFO extends AbstractBag{

	
	@Override
	public ISurprise takeOut() {
		
		ISurprise lastInFirstOut = surprise.get(surprise.size() - 1);
		surprise.remove(surprise.size() - 1);
		return lastInFirstOut;
		
	}

	@Override
	public String toString() {
		return "LIFO and it contains" + super.toString();
	}
	
}
