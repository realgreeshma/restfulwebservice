package com.learn.rest.webservices.restfulwebservices.applicant;

import com.learn.rest.webservices.restfulwebservices.applicant.Applicant;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//Here we are creating user details instead of connecting to database
//we use @Component to work as spring class
@Component
public class ApplicantDaoService
{
    private static List<Applicant> applicants = new ArrayList<>();

    static
    {
        applicants.add(new Applicant(1,"Wright",new Date()));
        applicants.add(new Applicant(2,"Megan",new Date()));
        applicants.add(new Applicant(3,"Canon",new Date()));
    }
    private static int applicants_count = 3;

    //Find All Applicants
    public List<Applicant> findAllApplicants()
    {
        return applicants;
    }

    //Add a new  Applicant
    public Applicant save( Applicant applicant)
    {
        if(applicant.getApplication_num()==null)
        {
            applicant.setApplication_num(++applicants_count);
        }
        applicants.add(applicant);
        return applicant;
    }

    // Find only one applicant
    public Applicant findOneApplicant(int id)
    {
        for (Applicant applicant : applicants)
        {
            if (applicant.getApplication_num() == id)
            {
                return applicant;
            }
        }
        return null;
    }
}
