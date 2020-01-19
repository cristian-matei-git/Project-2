package Surprises;

import java.util.ArrayList;
import java.util.Random;

import Interfaces.ISurprise;

public class Candies implements ISurprise{
	
	@Override
	public String toString() {
		return this.number + " " +this.type + " candies";
	}

	private String type;
	private int number;
	private static final Random random = new Random();
	
	public void enjoy() {
		System.out.println("Enjoy your " + this.number + " " + this.type +" candies!");
	}
	
	public Candies(int r1, int r2) {
		
		this.type = candyTypes.get(r1);
		this.number = r2;
	}
	
	public Candies() {
		super();
	}
	
	private static final ArrayList<String> candyTypes = new ArrayList<String> () {
		{	
			add("chocolate");
			add("jelly");
			add("fruits");
			add("vanilla");
		}
	};
	
	public static Candies generate() {
		int r1 = 0;
		int r2 = 0;
		do {
			r1 = random.nextInt(4);
			r2 = random.nextInt(21);
		}while(r1 == 0 || r2 == 0);
		Candies c = new Candies(r1, r2);
		return c;
		
	}
	
}
