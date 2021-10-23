//Shanna Warrington
//10-4-2021
//CS-320-H1873
//The contact service test file uses Junit test to verify that the contact service file is running accurately.

package test.java;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import main.java.Contact;
import main.java.ContactService;

class contactServiceTest {
	//In here we will test that adding, deleting, and updating the contact service file run correctly.
	

	@Test
	void testAddContact() {
		ContactService conser = new ContactService();
		Contact test1 = new Contact("Mary Jane", "Robertson", "76589", "7615489087", "480 E Sandover St");
		assertEquals(true, conser.addContact(test1));
	}
	
	@Test
	void testDeleteContact() {
		ContactService conser = new ContactService();
		Contact test2 = new Contact("Doug", "Cockle", "9161970", "5093174309", "101 W Twentynine Ave");
		assertEquals(true, conser.deleteContact(test2));
	}
	
	@Test
	void testUpdateContact() {
		ContactService conser = new ContactService();
		Contact test3 = new Contact("Elizabeth", "Pudding", "108756", "3968254855", "5784 S 5th St");
		assertEquals(true, conser.updateContact("Julia", "Childs", "104657", "5078256644", "120 N Crest Blvd"));
	}

}
