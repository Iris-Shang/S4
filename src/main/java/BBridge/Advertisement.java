package BBridge;

import org.springframework.http.MediaType;
import org.springframework.web.client.RestClient;

public class Advertisement
{
	String content;
	int time;
	int ID;
	public Advertisement(int ID,String content,int time) 
	{
		this.ID = ID;
		this.time = time;
		this.content = content;
		
	}
	
	@SuppressWarnings("unused")
	public void createinrest() 
	{
		//when user create an account, create an object at the same time to rest to save data
		RestClient client = RestClient.create();
		
		String uriBase = "http://localhost:9000/v1";
		String urib = uriBase+"/Project1/Advertisement/"+this.ID;

		String savedata = client.post()
		.uri(urib)
		.contentType(MediaType.APPLICATION_JSON)
		.body(this)
		.retrieve()
		.body(String.class);		
		
	}
	@SuppressWarnings("unused")
	public void updateinrest() 
	{
		RestClient client = RestClient.create();
		
		String uriBase = "http://localhost:9000/v1";
		String urib = uriBase+"/Project1/Advertisement/"+this.ID;

		String savedata = client.put()
		.uri(urib)
		.contentType(MediaType.APPLICATION_JSON)
		.body(this)
		.retrieve()
		.body(String.class);

		
	}
	

	/**
	 * @return the content
	 */
	public String getContent()
	{
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content)
	{
		this.content = content;
	}

	/**
	 * @return the time
	 */
	public int getTime()
	{
		return time;
	}

	/**
	 * @param time the time to set
	 */
	public void setTime(int time)
	{
		this.time = time;
	}

	/**
	 * @return the iD
	 */
	public int getID()
	{
		return ID;
	}

	/**
	 * @param iD the iD to set
	 */
	public void setID(int iD)
	{
		ID = iD;
	}

	@Override
	public String toString()
	{
		return "Advertisement [content=" + content + ", time=" + time + ", ID=" + ID + "]";
	}
	
	

}
