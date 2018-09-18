import java.util.ArrayList;

public interface IContactDAO {

	ArrayList<Contact> readAll();

	Contact findByName(String nom);

	void add(Contact contact);

}