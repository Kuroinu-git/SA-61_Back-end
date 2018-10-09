package com.example.demo.repository;
import com.example.demo.entity.Owner;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
// import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
// @CrossOrigin(origins = "http://localhost:4200")

public
interface OwnerRepository extends JpaRepository<Owner, String> {
    Owner findByownerName(String ownerName);
    Owner findBytel(String tel);
}