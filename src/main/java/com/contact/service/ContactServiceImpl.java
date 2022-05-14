package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService{
	
	// fake list of contacts
	
	List<Contact> list = List.of(
			new Contact(1L,"om.xa.kumar@gmail.com","Om Kumar", 1311L),
			new Contact(2L,"chhaya.tripathi@gmail.com","Chhaya Tripathi", 1312L),
			new Contact(6L,"chhaya.tripathi@gmail.com","Chhaya Tripathi", 1312L),
			new Contact(3L,"ankit.tiwari@gmail.com","Ankit Tiwari", 1313L),
			new Contact(4L,"vishnu.tiwari@gmail.com","Vishnu Tiwari", 1314L)
			);

	@Override
	public List<Contact> getContactsOfUser(Long userId) {
		return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
