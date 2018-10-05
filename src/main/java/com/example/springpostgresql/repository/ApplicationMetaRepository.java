package com.example.springpostgresql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springpostgresql.domain.ApplicationMeta;

@Repository
public interface ApplicationMetaRepository extends JpaRepository<ApplicationMeta, String> {
	
	ApplicationMeta findByName(String name);

}
