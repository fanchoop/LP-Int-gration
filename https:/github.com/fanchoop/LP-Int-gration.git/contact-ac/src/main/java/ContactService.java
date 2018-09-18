public class ContactService {
	private IContactDAO dao;

	public void ajouterContact() {

	}

	public void add(String nom) throws ContactDuplicateException {

		if (!nom.equals("") && nom.length() > 2 && nom.length() < 39) {
			if (dao.findByName(nom) != null) {
				throw new ContactDuplicateException("Contact already exists");
			}

			Contact cont = new Contact();
			cont.setNom(nom);
			dao.add(cont);
		} else {
			System.out.println("Le nom du contact ne remplis pas les conditions");
		}
	}

	public void sup(String nom) throws ContactNotExistException {
		if (dao.findByName(nom) == null) {
			throw new ContactNotExistException("Contact doesn't exist");
		}

		Contact cont = new Contact();
		cont.setNom(nom);
		dao.sup(cont);
	}
}