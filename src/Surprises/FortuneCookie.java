package Surprises;

import java.util.ArrayList;
import java.util.Random;

import Interfaces.ISurprise;

public class FortuneCookie implements ISurprise{
	
	@Override
	public String toString() {
		return "a fortune cookie";
	}

	private static final Random random = new Random();
	private String proverb;
	
	private static final ArrayList<String> sayings = new ArrayList<String> () {
			{
				add("\"The journey of a thousand miles begins with one step.\" ~ Laozi");
				add("\"He who laughs at himself never runs out of things to laugh at.\" ~ Epictetus");
				add("\"We tend to get what we expect.\" ~ Norman Vincent Peale");
				add("\"Warning: fortune cookies don't care what happens to you.\" ~ Mason Cooley");
				add("\"Who needs astrology? The wise man gets by on fortune cookies.\" ~ Edward Abbey");
				add("\"Once I opened up a fortune cookie and inside was the guy's cheque next to me I said hey buddy I got your cheque he said thanks.\" ~ Rodney Dangerfield");
				add("\"I just got a fortune cookie that says \"Turn off your computer and read a book\" which is odd because I'm WRITING a book...on my computer!\" ~ Meg Cabot");
				add("\"Life is a promise; fulfill it.\" ~ Mother Teresa");
				add("\"A man of sixty has spent twenty years in bed and over three years in eating.\" ~ Arnold Bennett");
				add("\"Well begun is half done.\" ~ Aristotle");
				add("\"In good times, people want to advertise; in bad times, they have to.\" ~ Bruce Barton");
				add("\"Only the educated are free.\" ~ Epictetus");
				add("\"The best way to make children good is to make them happy.\" ~ Oscar Wilde");
				add("\"Fortune cookies are a good idea. If the message is positive, it can make your day a little better.\" ~ Yao Ming");
				add("\"Every man over forty is a scoundrel.\" ~ George Bernard Shaw");
				add("\"Be wise with speed; a fool at forty is a fool indeed.\" ~ Edward Young");
				add("\"What you earn depends on what you learn.\" ~ William J. Clinton");
				add("\"Wealth can't buy heath, but heath can buy wealth.\" ~ Henry David Thoreau");
				add("\"Purpose, pattern, and people, the three P's at the heart of life.\" ~ Charles Handy");
				add("\"Outward success alienates a man from himself.\" ~ James T. Hill");
			}
	};
	
	public void enjoy() {
		System.out.println("Enjoy your fortune cookie: " + this.proverb);
	}
	
	public FortuneCookie(int r1) {
		this.proverb = sayings.get(r1);
	}
	
	public static FortuneCookie generate() {
		
		int r1 = random.nextInt(19);
		
		FortuneCookie fc = new FortuneCookie(r1);
		return fc;
		
	}
}
