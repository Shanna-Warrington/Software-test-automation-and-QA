//Shanna Warrington
//10-4-2021
//CS-320-H1873
//The contact test file uses Junit test to verify that the contact file is running accurately.

package test.java;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import main.java.Contact;

class contactTest {
	

	@Test
	void testContact() {
		Contact Contact = new Contact("John", "Smith", "12345", "5414327755", "3030 W Eorzea Lane");
		assert(Contact.getFirstName().equals("John"));
		assert(Contact.getLastName().equals("Smith"));
		assert(Contact.getContactID().equals("12345"));
		assert(Contact.getPhoneNumber().equals("5414327755"));
		assert(Contact.getAddress().equals("3030 W Eorzea Lane"));
	}
	@Test
	void testContactFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("Mynameistoolongtobetrue", "Smith", "12345", "5414327755", "3030 W Eorzea Lane");
		});
		
	}
	@Test
	void testContactLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("John", "Whatkindoflastnameisthis", "12345", "5414327755", "3030 W Eorzea Lane");
		});
		
	}
	@Test
	void testContactFirstNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact(null, "Smith", "12345", "5414327755", "3030 W Eorzea Lane");
		});
		
	}
	@Test
	void testContactLastNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("John", null, "12345", "5414327755", "3030 W Eorzea Lane");
		});
	
	}
	@Test
	void testContactIDIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("John", "Smith", null, "5414327755", "3030 W Eorzea Lane");
		});
	
	}
	@Test
	void testContactIDIsTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("John", "Smith", "12345111111", "5414327755", "3030 W Eorzea Lane");
		});
	
	}
	@Test
	void testContactPhoneTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("John", "Smith", "12345", "541432775589", "3030 W Eorzea Lane");
		});
	
	}
	@Test
	void testContactPhoneIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("John", "Smith", "12345", null, "3030 W Eorzea Lane");
		});
	
	}
	@Test
	void testContactAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("John", "Smith", "12345", "5414327755", "3030 W Eorzea Lane behind New Gridania's tavern");
		});
	
	}
	@Test
	void testContactAddressIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("John", "Smith", "12345", "5414327755", null);
		});
	
	}

}