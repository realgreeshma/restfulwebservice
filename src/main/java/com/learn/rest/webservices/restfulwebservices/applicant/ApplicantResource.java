package com.learn.rest.webservices.restfulwebservices.applicant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApplicantResource
{
    @Autowired
    private ApplicantDaoService service;

    //Get all users
    @GetMapping("/Applicants")
    public List<Applicant> getAllApplicants()
    {
        return service.findAllApplicants();
    }

    @GetMapping("/Applicants/{id}")
    public Applicant getOneApplicant(@PathVariable int id)
    {
        return service.findOneApplicant(id);
    }

    /*input - details of user
    output - CREATED n return created URI
*/
    @PostMapping("/Applicants")
    public void createApplicant(@RequestBody Applicant applicant)
    {
        Applicant savedApplicant = service.save(applicant);

        

    }
}
