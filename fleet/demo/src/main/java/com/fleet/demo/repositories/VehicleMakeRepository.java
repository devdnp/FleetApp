package com.fleet.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fleet.demo.models.Client;
import com.fleet.demo.models.VehicleMake;

@Repository
public interface VehicleMakeRepository extends JpaRepository<VehicleMake, Integer> {

}
