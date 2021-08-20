package com.jobstatus.jobstatus.Controllers;

import com.jobstatus.jobstatus.Daos.JobsRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JobsController {
    private final JobsRepository jobsDao;

    public JobsController(JobsRepository jobsDao){
        this.jobsDao = jobsDao;
    }

    @GetMapping("/jobs")
    public String viewAllJobs(Model model){
        model.addAttribute("jobs", jobsDao.findAll());
        return "jobs";
    }

    @GetMapping("jobs/{id}")
    public String viewOneJob(@PathVariable int id, Model model){
        model.addAttribute("jobStatus", jobsDao.getById(id));
        return "jobs/staus";
    }
}
