package com.example.JobSearchPortal.Service;

import com.example.JobSearchPortal.Model.Job;
import com.example.JobSearchPortal.Repo.IJobRepo;
import jakarta.transaction.Transactional;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    IJobRepo iJobRepo;

    public String AddJobs(List<Job> myjobs) {
        iJobRepo.saveAll(myjobs);
        return "job's posted";
    }



    public List<Job> getJobs() {
        return  (List<Job>) iJobRepo.findAll();
    }

    public List<Job> getJobByLocation(String location) {
        return iJobRepo.findByLocation(location);
    }



    public List<Job> getJobByTitle( String title) {
        return iJobRepo.findByTitle(title);
    }
@Transactional
    public String updateJobBySalary(@NotNull @Min(20000) Double newsalary) {
        iJobRepo.updateJobBySalary(newsalary);
        return "updated";
    }
@Transactional
    public String deleteJobByCompanyName(String mycompanyname) {
        iJobRepo.deleteJobByCompanyName(mycompanyname);

        return "deleted";
    }
}
