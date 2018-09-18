
public class ContactService {
	
	private IContactDAO dao = new ContactDAO();
	
	public void add(String contactName) throws ContactDuplicateException {
		if(!contactName.equals(null) && contactName.length()>2 && contactName.length()<39) {
			if(dao.findByName(contactName) != null) {
				throw new ContactDuplicateException("Contact already exists");
			}
			Contact c= new Contact();
			c.setNom(contactName);
			dao.add(c);
		}
		else {
			System.out.println("Format impossible");
		}
	}
	

	public void del(String name)  throws ContactNotFound{
	if(name==null) {
		throw new IllegalArgumentException("Name can't be null");
	}
	dao.findByName(name);//
	//.orElseThrows(() ->
	//new ContactNotFound("contact "+ name +""));
	}
}