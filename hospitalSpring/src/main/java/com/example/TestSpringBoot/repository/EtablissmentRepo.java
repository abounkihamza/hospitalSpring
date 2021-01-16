package com.example.TestSpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.TestSpringBoot.entites.Etablissement;

@RepositoryRestResource
@CrossOrigin("*")
public interface EtablissmentRepo extends JpaRepository<Etablissement,Long>{

}
