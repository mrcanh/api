package com.vn.vsii.apitest.repository;

import com.vn.vsii.apitest.model.Contact;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ContactRepository extends CrudRepository<Contact,Integer> {
    List<Contact> findByFirstNameContaining(String term);
}
