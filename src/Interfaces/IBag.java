package Interfaces;

public interface IBag {
	
	void put(ISurprise newSurprise);
	
	void put(IBag bagOfSurprises);
	
	ISurprise takeOut();
	
	boolean isEmpty();
	
	int size();

}
