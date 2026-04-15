package com.nonsyncbobbal.jobappliaction.service;

import com.nonsyncbobbal.jobappliaction.model.JobPost;
import com.nonsyncbobbal.jobappliaction.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;
    public List<JobPost> getJobs(){
         return repo.getJobs();
    }


}
