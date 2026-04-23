package com.nonsyncbobbal.jobappliaction.controller;

import com.nonsyncbobbal.jobappliaction.model.JobPost;
import com.nonsyncbobbal.jobappliaction.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JobController {

    @Autowired
    private JobService jobService;

    @GetMapping("job")
    public List<JobPost> getJobs(){
        return jobService.getJobs();
    }
    @PostMapping("job")
    public ResponseEntity<String> addJob(@RequestBody JobPost job) {
        return new ResponseEntity<>(jobService.addJob(job), HttpStatus.OK);
    }


}
