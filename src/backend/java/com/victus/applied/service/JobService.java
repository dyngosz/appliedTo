package com.victus.applied.service;

import com.victus.applied.entity.Job;
import com.victus.applied.repository.JobRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    private JobRepository jobRepository;

    public JobService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    public List<Job> findAll(){
        return jobRepository.findAll();
    }
}
