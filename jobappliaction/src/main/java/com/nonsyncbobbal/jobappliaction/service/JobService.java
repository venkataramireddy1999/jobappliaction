package com.nonsyncbobbal.jobappliaction.service;

import com.nonsyncbobbal.jobappliaction.model.JobPost;
import com.nonsyncbobbal.jobappliaction.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;

    public List<JobPost> getJobs(){
         return repo.getJobs();
    }
    public String addJob(JobPost job) {
        repo.addJob(job);
        return "Job added successfully";
    }


}
