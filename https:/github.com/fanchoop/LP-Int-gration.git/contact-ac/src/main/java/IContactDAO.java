import java.util.List;

public interface IContactDAO {

	List<Contact> readAll();

	Contact findByName(String name);

	void add(Contact contact);

	void sup(Contact contact);

}