import redis.clients.jedis.*;

public class Publisher
{
	public static void main(String args[])
	{
		Jedis jedis=new Jedis("localhost");
		
		while(true)
		{
			String msg = "Hello";
			System.out.println(msg);
			jedis.publish("Rakshant", msg);
			try { Thread.sleep(300); } catch(Exception e) { e.printStackTrace(); }
		}	
		
	}
}