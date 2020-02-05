package observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
	private List<Subsriber> subscribers = new ArrayList<>();
	private String title;
	String s;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public void subscribe(Subsriber sub) {
		subscribers.add(sub);
	}
	@Override
	public void notifySubscribes()
	{
		for(Subsriber sub : subscribers)
		{
			sub.update();
		}
	}
	@Override
	public void upload(String titlename)
	{
		this.title = titlename;
		this.s = titlename;
		this.setTitle(titlename);
		notifySubscribes();
	}
	@Override
	public void unSubscibe(Observer sub) {
		subscribers.remove(sub);
	}
	
}
