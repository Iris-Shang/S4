package BBridge;

public class ComADStore implements ServiceStrore
{


	public Service createService(int serviceID,String Adtype, Company com)
	{
		Service s;
		if (Adtype == "Com") 
		{
			s = new ComAD(serviceID,com.ID,Adtype);
			
		}
		else 
		{
			return null;
		}
		return s;
	}


	public Service orderService(int serviceid, String specificty)
	{
		
		return null;
	}

	@Override
	public Service createService()
	{
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Service orderService()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
