package Surprises;
import Bag.AbstractBag;
import Bag.FIFO;

import java.util.ArrayList;
import java.util.Random;

import Interfaces.ISurprise;
import Interfaces.IBag;

public final class GatherSurprises {
	
	private static final Random random = new Random();
	
	private GatherSurprises() {
		super();
	}
	
	public static ArrayList<ISurprise> gather(int n) {
		
		ArrayList<ISurprise> array = new ArrayList<ISurprise>(n);
		
		for(int i = 0; i < n; i++) {
			
			array.add(GatherSurprises.gather());
			
		}
		
		return array;
		
	}
	
	public static ISurprise gather() {
		
		int r1 = random.nextInt(3);
		
		if(r1 == 0) {
			return FortuneCookie.generate();
		}
		else if(r1 == 1) {
			return Candies.generate();
		}
		
		return MinionToy.generate();
		
	}

}
