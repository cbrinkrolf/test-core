package entities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PersonTest {

	@Test
	void testSetFirstName() {

		Person p = new Person();
		String firstName = "first name";

		p.setFirstName(firstName);

		assertEquals(firstName, p.getFirstName());
	}

}
