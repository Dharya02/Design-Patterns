import java.util.*;
class Sender
{
    private List<Subscriber> subs = new ArrayList<>();
	private String message;
	public void subscribe(Subscriber s)
	{
		subs.add(s);
	}
	public void unsubscribe(Subscriber s)
	{
		subs.remove(s);
	}
	public void publishMessage(String message)
	{
		this.message = message;
		sendMessage();
	}
	public void sendMessage()
	{
		for(Subscriber s : subs)
		{
			s.update();

		}
	}
}
//    Sender ytGaming = new Sender("Youtube Gaming");

//    Subscriber s1 = new Subscriber("A");
//    s1.subscriberSender(); 
class Subscriber //channel ko subscriber krega..
{
	private String name;
	private Sender sd; //refrence is sd of sender..
	
	Subscriber(String name)
	{
		this.name=name;
    }
	public void subscribeSender(Sender sd)
	{
		this.sd=sd;
	}
	public void update()
	{
		System.out.println(this.name+" :Message Published");
	}
}

public class ObserverDemo
{
	public static void main(String... args)
	{
		Sender sd = new Sender();
		Subscriber s1 = new Subscriber("A");
		Subscriber s2 = new Subscriber("B");
		Subscriber s3 = new Subscriber("c");

		sd.subscribe(s1);
		sd.subscribe(s2);
		sd.subscribe(s3);

		s1.subscribeSender(sd);
		s2.subscribeSender(sd);
		s3.subscribeSender(sd);
	sd.publishMessage("Hello World");	
    }
}

// A :Message Published
// B :Message Published
// C:Message Published
		