package com.example.JobSearchPortal.Controller;

import com.example.JobSearchPortal.Model.Job;
import com.example.JobSearchPortal.Service.JobService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobController {
    @Autowired
    JobService jobService;

    //post jobs
    @PostMapping("jobs")
    public String AddJobs(@RequestBody @Valid List<Job> myjobs){
       return jobService.AddJobs(myjobs);
    }

    // get all jobs
    @GetMapping("jobs")
    public List<Job> getjob(){
        return jobService.getJobs();
    }

    // get jobs by location using custom finder
    @GetMapping("job/location/{location}")
    public List<Job> getJobByLocation(@PathVariable String location){
        return jobService.getJobByLocation(location);
    }

    // get jobs by title by using cumtom finder
    @GetMapping("job/title/{title}")
    public List<Job> getJobByTitle(@PathVariable String title){
        return jobService.getJobByTitle(title);
    }

    // update job salary

    @PutMapping("job/salary/{newsalary}")
    public String updateJobBySalary(@PathVariable @Valid Double newsalary){
        return jobService.updateJobBySalary(newsalary);
    }


    // delete by company name
@DeleteMapping("job/company/name")
    public String deleteJobByCompanyName(@RequestParam String mycompanyname){
        return jobService.deleteJobByCompanyName(mycompanyname);
}
}
