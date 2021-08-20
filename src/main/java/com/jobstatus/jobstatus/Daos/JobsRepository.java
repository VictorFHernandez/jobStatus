package com.jobstatus.jobstatus.Daos;

import com.jobstatus.jobstatus.Models.Jobs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobsRepository extends JpaRepository<JobsRepository, Long> {
    Jobs getById(long id);
}
