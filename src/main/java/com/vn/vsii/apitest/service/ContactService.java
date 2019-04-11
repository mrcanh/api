package com.vn.vsii.apitest.service;

import com.vn.vsii.apitest.model.Contact;

public interface ContactService {
        Iterable<Contact>findAll();
        Contact findById(Integer id);
        void save(Contact contact);
        void delete(Integer id);
}
