package com.designpatterns.main;

import com.designpatterns.creational.Contact;
import com.designpatterns.creational.ContactBuilder;

public class ContactMain {
	
	public static void main(String[] args) {

		Contact contact = new ContactBuilder().firstName("Elon").lastName("Musk").mobileNumber(9876543210l)
				.getContact();
		System.out.println(contact);

	}

}
