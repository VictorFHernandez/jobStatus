package com.jobstatus.jobstatus.Models;

import javax.persistence.*;

@Entity
@Table(name = "jobs")
public class Jobs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 255)
    private String job_name;

    @Column(nullable = false, length = 255)
    private String status;

    public Jobs(){

    }

    public Jobs(String job_name, String status){
        this.job_name = job_name;
        this.status = status;
    }

    public Jobs(long id, String job_name, String status){
        this.id = id;
        this.job_name = job_name;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getJob_name() {
        return job_name;
    }

    public void setJob_name(String job_name) {
        this.job_name = job_name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
