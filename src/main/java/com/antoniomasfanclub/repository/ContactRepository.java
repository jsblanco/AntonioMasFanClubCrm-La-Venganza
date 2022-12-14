package com.antoniomasfanclub.repository;

import com.antoniomasfanclub.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {
    Contact getContactById(Integer id);
}
