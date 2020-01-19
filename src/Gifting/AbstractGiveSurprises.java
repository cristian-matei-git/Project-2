package Gifting;

import Interfaces.IBag;
import Interfaces.IBagFactory;
import Interfaces.ISurprise;
import Surprises.Candies;
import Surprises.FortuneCookie;
import Surprises.MinionToy;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import Bag.FIFO;
import Bag.LIFO;
import Bag.RANDOM;

public abstract class AbstractGiveSurprises implements IBagFactory{
	
	private IBag bag;
	private int waitTime;
	
	public AbstractGiveSurprises(String containerType, int waitTime) {
		this.bag = this.makeBag(containerType);
		this.waitTime = waitTime;
	}
	
	public AbstractGiveSurprises() {
		super();
	}
	
	public void put(ISurprise newSurprise) {
		
		bag.put(newSurprise);
		
	}
	
	public void put(IBag surprises) {
		
		while(!surprises.isEmpty()) {
			bag.put(surprises.takeOut());
		}
	}
	public IBag getBag() {
		
		return this.bag;
		
	}
	public void give() {
		
		bag.takeOut().enjoy();
		
	}
	
	public void giveAll() {
		while(!this.bag.isEmpty()) {

			this.give();
			
			try {
			
				TimeUnit.SECONDS.sleep(waitTime); 
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
		}
	}
			
	@Override
	public String toString() {
		return "The type of bag is " + this.bag;
	}

	public boolean isEmpty() {
		if(bag.isEmpty()) {
			System.out.println("Unfortunately the bag is empty.");
		}
		return bag.isEmpty();
		
	}
	
	abstract void giveWithPassion();

	@Override
	public IBag makeBag(String type) {
		
		switch(type) {
			case "FIFO":
				this.bag = new FIFO();
				break;
			case "LIFO":
				this.bag = new LIFO();
				break;
			case "RANDOM":
				this.bag = new RANDOM();
				break;
		}
		
		return this.bag;
		
	}
	
	
	
}
