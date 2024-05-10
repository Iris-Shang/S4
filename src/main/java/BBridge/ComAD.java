package BBridge;

public class ComAD extends Service
{
	String content;
	String type;
	int ID;
	int time;
	int price;

	public ComAD(int ID, int owner, String type) 
	{
		Person A = new Person();
		this.ID = ID;
		this.ownerID = owner;
		this.type = type;
		this.time = 30;
		this.price = 3000;
		String ownername = A.findacom(owner).name;
		String content = "LOOK AT ME!! I AM COMPANY" + ownername;
		this.content = content;
		
	}
	@Override
	public void doService()
	{
		Advertisement a = new Advertisement(this.ID,this.content,this.time);
		a.createinrest();
		
	}

}
