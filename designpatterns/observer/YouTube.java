package observer;

public class YouTube {

	public static void main(String[] args) {
		
		Channel newsChannel = new Channel();
		
		Channel videotitle = new Channel();
		Subsriber s1 = new Subsriber("Niranjan");
		Subsriber s2 = new Subsriber("Tangodar");
		Subsriber s3 = new Subsriber("Yadav");
		Subsriber s4 = new Subsriber("DoubleRebel");
		
		/**
		 * subscribing to channel 
		 */
		newsChannel.subscribe(s1);
		newsChannel.subscribe(s2);
		newsChannel.subscribe(s3);
		newsChannel.subscribe(s4);
		
		
		s1.subscibeChannel(newsChannel);
		s2.subscibeChannel(newsChannel);
		s3.subscibeChannel(newsChannel);
		s4.subscibeChannel(newsChannel);
		
		newsChannel.upload("yo");
		
		
		
		
		
		
		
	}
}
