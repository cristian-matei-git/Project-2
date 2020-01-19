package Bag;

import java.util.Random;
import Interfaces.ISurprise;

public class RANDOM extends AbstractBag{
	
	private static final Random random = new Random();
	
	@Override
	public ISurprise takeOut() {
		
		int r1 = 0;
		if(!surprise.isEmpty()) {
			r1 = random.nextInt(surprise.size());
		}
		ISurprise random = surprise.get(r1);
		surprise.remove(r1);
		return random;
		
	}

	@Override
	public String toString() {
		return "RANDOM and it contains" + super.toString();
	}
	
}
