package com.jobstatus.jobstatus.Daos;

import com.jobstatus.jobstatus.Models.Jobs;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobsRepository extends JpaRepository<JobsRepository, Long> {
    Jobs findAll(long id);
}
