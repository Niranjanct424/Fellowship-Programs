package observer;

public interface Subject {

	void subscribe(Subsriber sub);

	void unSubscibe(Observer sub);

	void notifySubscribes();

	public void upload(String titlename);

}