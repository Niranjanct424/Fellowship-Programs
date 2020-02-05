package observer;

public class Subsriber {
	private String name;
	Channel ch = new Channel();
	
	public Subsriber(String name) {
		super();
		this.name = name;
	}

	private Channel channel = new Channel();
	
	public void update()
	{
		System.out.println("Hey "+name+" , video uploaded ");
	}
	
	public void subscibeChannel(Channel channel)
	{
		this.channel = channel;
	}
}
