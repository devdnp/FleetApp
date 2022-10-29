package com.fleet.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fleet.demo.models.Client;
@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
