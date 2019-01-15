package com.learn.rest.webservices.restfulwebservices.applicant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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
}
