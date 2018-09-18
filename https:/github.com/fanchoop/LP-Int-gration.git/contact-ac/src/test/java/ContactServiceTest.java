import org.junit.Test;

public class ContactServiceTest {

	private ContactService service = new ContactService();

	@Test
	public void testAddNull() throws ContactDuplicateException {
		service.add(null);
	}

	@Test
	public void testAddLong() throws ContactDuplicateException {
		service.add("qkfhqkgfkqjgfkqjgfkqjgfkJGFSKJFGQSLKDFGSKLDFGQSKLDJGFHSQKLJHFSKJGSQKJHFQSKDGFSKJGFSQKFKLSJH");
	}

	@Test
	public void testAddCourt() throws ContactDuplicateException {
		service.add("ac");
	}

	@Test
	public void testAddIdem() {
	}

	@Test
	public void testAddNormal() {
	}

}
