package com.learn.rest.webservices.restfulwebservices.applicant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
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
   /* public Applicant getOneApplicant(@PathVariable int id)
    {
        return service.findOneApplicant(id);
    }*/
    public Applicant getOneApplicant(@PathVariable int id)
    {

        Applicant applicant = service.findOneApplicant(id);
        if (applicant == null)
            throw new ApplicantNotFoundException("id-"+id);
        return applicant;
    }


    /*input - details of user
    output - CREATED n return created URI
*/
    @PostMapping("/Applicants")
    public ResponseEntity createApplicant(@RequestBody Applicant applicant)
    {
        Applicant savedApplicant = service.save(applicant);

        //CREATED
        // /Applicants/4

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedApplicant.getApplication_num())
                .toUri();

        return ResponseEntity.created(location).build();



    }
}
