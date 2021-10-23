//Shanna Warrington
//10-04-2021
//CS-320-H1873
//The contact file is allows the user to input their contact information into an application.

package main.java;

	import java.util.concurrent.atomic.AtomicLong;

	public class Contact {
		
		//Stating the variables.
		private String firstName;
		private String lastName;
		private final String contactID;
		private String phoneNumber;
		private String address;
		private static AtomicLong idGenerator = new AtomicLong();
		
		//Constructors
		public Contact(String firstName, String lastName, String contactID, String phoneNumber, String address) {
			//First Name. Cannot be null or longer than 10 characters.
			if(firstName == null || firstName.isEmpty()) {
				throw new IllegalArgumentException("Please enter your first name.");
			}else if (firstName.length() > 10) {
				throw new IllegalArgumentException("First name cannot be more than 10 digits.");
			}else {
				this.firstName = firstName;
			}
			
			//Last Name. Cannot be null or longer than 10 characters.
			if(lastName == null || lastName.isEmpty()) {
				throw new IllegalArgumentException("Please enter your last name.");
			}else if (lastName.length() > 10) {
				throw new IllegalArgumentException("Last name is too long.");
			}else {
				this.lastName = lastName;
			}
			
			//Contact ID. Generates a unique ID for each contact.
			this.contactID = String.valueOf(idGenerator.getAndIncrement());
			
			//Phone Number. Cannot be null or longer than 10 characters.
			if (phoneNumber == null || phoneNumber.isEmpty() || phoneNumber.length() != 10) {
				throw new IllegalArgumentException("Please enter phone number, 10 digits only.");
			} else {
				this.phoneNumber = phoneNumber;
			}
			
			//ADDRESS. Cannot be null or longer than 30 characters.
			if (address == null || address.isEmpty()) {
				throw new IllegalArgumentException("Please fill in your adress.");
			} else if(address.length() > 30) {
				throw new IllegalArgumentException("Address is too long.");
			} else {
				this.address = address;
			}
		}
		
		
		
		//Getters and Setters
		
		//first Name
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			//First Name. Cannot be null or longer than 10 characters.
			if(firstName == null || firstName.isEmpty()) {
				throw new IllegalArgumentException("Please enter your first name.");
			}else if (firstName.length() > 10) {
				throw new IllegalArgumentException("First name cannot be more than 10 digits.");
			}else {
				this.firstName = firstName;
			}
		}
		
		//Last Name
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			//Last Name. Cannot be null or longer than 10 characters.
			if(lastName == null || lastName.isEmpty()) {
				throw new IllegalArgumentException("Please enter your last name.");
			}else if (lastName.length() > 10) {
				throw new IllegalArgumentException("Last name is too long.");
			}else {
				this.lastName = lastName;
			}
		}

		//Contact ID
		public String getContactID() {
			return contactID;
		}
		
		//Phone Number
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			//Phone Number. Cannot be null or longer than 10 characters.
			if (phoneNumber == null || phoneNumber.isEmpty() || phoneNumber.length() != 10) {
				throw new IllegalArgumentException("Please enter phone number, 10 digits only.");
			} else {
				this.phoneNumber = phoneNumber;
			}
		}
		
		//Address
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			//ADDRESS. Cannot be null or longer than 30 characters.
			if (address == null || address.isEmpty()) {
				throw new IllegalArgumentException("Please fill in your adress.");
			} else if(address.length() > 30) {
				throw new IllegalArgumentException("Address is too long.");
			} else {
				this.address = address;
			}
		}
}
