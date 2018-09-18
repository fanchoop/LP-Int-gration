import java.util.ArrayList;

public class ContactDAO implements IContactDAO {

	private ArrayList<Contact> contacts = new ArrayList<Contact>();
	
	/* (non-Javadoc)
	 * @see IContactDAO#readAll()
	 */
	@Override
	public ArrayList<Contact> readAll(){
		return contacts;
	}
	
	/* (non-Javadoc)
	 * @see IContactDAO#findByName(java.lang.String)
	 */
	@Override
	public Contact findByName(String nom) {
		Contact rep=null;
		for (Contact contact : contacts) {
			if (contact.getNom().equals(nom)) {
				rep=contact;
			}
		}
		return rep;
	}
	
	/* (non-Javadoc)
	 * @see IContactDAO#add(Contact)
	 */
	@Override
	public void add(Contact contact) {
		if(!contacts.contains(contact)){
			contacts.add(contact);
		}
	}
	
}
