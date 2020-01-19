package Main;

import java.util.ArrayList;
import java.util.Random;

import Bag.AbstractBag;
import Bag.FIFO;
import Bag.LIFO;
import Bag.RANDOM;
import Gifting.AbstractGiveSurprises;
import Gifting.GiveSurpriseAndApplause;
import Gifting.GiveSurpriseAndHug;
import Gifting.GiveSurpriseAndSing;
import Interfaces.IBag;
import Interfaces.IBagFactory;
import Interfaces.ISurprise;
import Surprises.Candies;
import Surprises.FortuneCookie;
import Surprises.GatherSurprises;
import Surprises.MinionToy;

public class Main {

	public static void main(String[] args) {
		
		Random random = new Random();
		int r1 = random.nextInt(3);
		int r2 = random.nextInt(19);
		
		System.out.println("\tWe create 3 bags: LIFO, FIFO, RANDOM");
		AbstractGiveSurprises bagLifoApplause = new GiveSurpriseAndApplause("LIFO", 1);
		AbstractGiveSurprises bagFifoApplause = new GiveSurpriseAndApplause("FIFO", 1);
		AbstractGiveSurprises bagRandomApplause = new GiveSurpriseAndApplause("RANDOM", 1);
		
		/*GiveSurpriseAndHug giver4 = new GiveSurpriseAndHug("LIFO", 7);
		GiveSurpriseAndHug giver5 = new GiveSurpriseAndHug("FIFO", 7);
		GiveSurpriseAndHug giver6 = new GiveSurpriseAndHug("RANDOM", 7);
		GiveSurpriseAndSing giver7 = new GiveSurpriseAndSing("LIFO", 12);
		GiveSurpriseAndSing giver8 = new GiveSurpriseAndSing("FIFO", 12);
		GiveSurpriseAndSing giver9 = new GiveSurpriseAndSing("RANDOM", 12);*/
		
		
		//We gather 5 surprises and put them in the LIFO bag
		System.out.println("\tWe gather 5 surprises and put them in the LIFO Bag");
		System.out.println();
		ArrayList<ISurprise> surprises = GatherSurprises.gather(5);
		
		for(int i = 0; i < surprises.size(); i++) {
			bagLifoApplause.put(surprises.get(i));
		}
		
		System.out.println(bagLifoApplause);
		System.out.println(bagFifoApplause);
		System.out.println(bagRandomApplause);
		System.out.println();
		
		//give a surprise
		System.out.println("\tWe give a surprise from the LIFO bag");
		System.out.println();
		bagLifoApplause.give();
		System.out.println();
		
		//give all the surprises
		System.out.println("\tWe give away all the surprises in the LIFO order");
		System.out.println();
		bagLifoApplause.giveAll();
		System.out.println(bagLifoApplause);
		System.out.println();
		
		//We create a surprise and put it in the LIFO bag and then transfer it to the FIFO bag
		System.out.println("\tWe create a surprise and put it in the LIFO bag");
		System.out.println();
		ISurprise surprise = GatherSurprises.gather();
		bagLifoApplause.put(surprise);
		System.out.println(bagLifoApplause);
		System.out.println();
		
		System.out.println("\tWe transfer the surprise from the LIFO bag in the FIFO bag");
		System.out.println();
		bagFifoApplause.put(bagLifoApplause.getBag());
		System.out.println(bagLifoApplause);
		System.out.println(bagFifoApplause);
		System.out.println();
		
		//we gather 5 surprises and put them in the RANDOM bag
		System.out.println("\tWe gather another 5 surprises and put them in the RANDOM bag");
		System.out.println();
		
		surprises = GatherSurprises.gather(5);
		
		for(int i = 0; i < surprises.size(); i++) {
			bagRandomApplause.put(surprises.get(i));
		}
		
		System.out.println(bagLifoApplause);
		System.out.println(bagFifoApplause);
		System.out.println(bagRandomApplause);
		System.out.println();
		//give a surprise
		System.out.println("\tWe give a surprise away from the RANDOM bag");
		System.out.println();
		bagRandomApplause.give();
		System.out.println();
		//give all the surprises in random order
		System.out.println("\tWe give away all the surprises in random order");
		System.out.println();
		bagRandomApplause.giveAll();
		System.out.println();
		System.out.println(bagRandomApplause);
		System.out.println();
		
		//create an ISurprise put it in fifo, gather candy and put it in fifo
		System.out.println("\tWe create a surprise and put it in the FIFO bag");
		System.out.println();
		ISurprise treat = GatherSurprises.gather();
		bagFifoApplause.put(treat);
		System.out.println(bagFifoApplause);
		System.out.println();
		
		System.out.println("\tWe create a surprise and put it in the FIFO bag");
		System.out.println();
		bagFifoApplause.put(GatherSurprises.gather());
		System.out.println(bagFifoApplause);
		System.out.println();
		
		System.out.println("\tWe put the whole FIFO bag in the RANDOM bag");
		System.out.println();
		bagRandomApplause.put(bagFifoApplause.getBag());
		System.out.println(bagRandomApplause);
		System.out.println(bagFifoApplause);
	}

}
