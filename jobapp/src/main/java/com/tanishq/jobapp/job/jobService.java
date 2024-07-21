package com.tanishq.jobapp.job;

import org.springframework.stereotype.Service;

import java.util.List;


public interface jobService {
    List<Job> findAll();
    void createJob(Job job);
    Job getJobById(Long id);
    boolean deleteJobById(Long id );
    boolean updateJob(Long id , Job job );



}
