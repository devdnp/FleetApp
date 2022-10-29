package com.fleet.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fleet.demo.models.Client;
import com.fleet.demo.models.JobTitle;

@Repository
public interface JobTitleRepository extends JpaRepository<JobTitle, Integer> {

}
