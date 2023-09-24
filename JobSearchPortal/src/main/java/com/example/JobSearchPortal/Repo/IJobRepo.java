package com.example.JobSearchPortal.Repo;

import com.example.JobSearchPortal.Model.Job;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IJobRepo extends CrudRepository<Job,Long> {


    List<Job> findByLocation(String location);



    List<Job> findByTitle(String title);
@Modifying
@Query(value = "UPDATE JOB SET SALARY = :newsalary WHERE JOB_TYPE='IT' ",nativeQuery = true)
    void updateJobBySalary(Double newsalary);
@Modifying
@Query(value = "DELETE FROM JOB WHERE COMPANY_NAME=:mycompanyname",nativeQuery = true)
    void deleteJobByCompanyName(String mycompanyname);
}
