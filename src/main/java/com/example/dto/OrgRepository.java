package com.example.dto;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.Org;

public interface OrgRepository extends JpaRepository<Org, Long> {

	List<Org> findOne(String lastName);

   // List<Org> findByLastName(String lastName);
}