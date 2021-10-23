//Shanna Warrington
//10-04-2021
//CS-320-H1873
//The contact service file allows the contact information to be added to, deleted, or updated in an application.


package main.java;

import java.util.*;

public class ContactService{

private final List<Contact> list = new ArrayList<>();
	
	//Generates a random unique ID.
	private String newUniqueID() {
		return UUID.randomUUID().toString().substring(
				0, Math.min(toString().length(), 10));
	}
	
	//Checking that the unique ID exists.
	private Contact searchForUniqueID(String uniqueID) throws Exception {
		int i = 0;
		while (i < list.size()) {
			if(uniqueID.equals(list.get(i).getContactID())) {
				return list.get(i);
			}
			i++;
		}
		throw new Exception("the unique ID is not found.");
	}
	
	//The contact service shall be able to add contacts with a unique ID.
	public void addContact(String firstName, String lastName, String phoneNumber, String address) {
		 Contact contact = new Contact(newUniqueID(), firstName, lastName, phoneNumber, address);
		 list.add(contact);
	}

	
	//The contact service shall be able to delete contacts per task ID.
	public void deleteContact(String uniqueID) throws Exception {
		list.remove(searchForUniqueID(uniqueID));
	}
	
	//The contact service shall be able to update contact fields per task ID.
	public void updateFirstName(String contactID, String firstName) throws Exception {
		 searchForUniqueID(contactID).setFirstName(firstName);
	}
	
	public void updateLastName(String contactID, String lastName)
		 throws Exception {
		 searchForUniqueID(contactID).setLastName(lastName);
	}
	
	public void updatePhoneNumber(String contactID, String phoneNumber)
			 throws Exception {
			 searchForUniqueID(contactID).setPhoneNumber(phoneNumber);
		}
	
	public void updateAddress(String contactID, String address)
			 throws Exception {
			 searchForUniqueID(contactID).setAddress(address);
		
	}
	List<Contact> getlistOfContact() { 
		return list; }
	
}