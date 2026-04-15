package com.nonsyncbobbal.jobappliaction.controller;

import com.nonsyncbobbal.jobappliaction.model.JobPost;
import com.nonsyncbobbal.jobappliaction.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JobController {

    @Autowired
    private JobService jobService;

    @GetMapping("Home")
    public List<JobPost> home(){
        return jobService.getJobs();
    }


}
