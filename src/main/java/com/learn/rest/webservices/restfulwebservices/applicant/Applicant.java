package com.learn.rest.webservices.restfulwebservices.applicant;

import java.util.Date;

public class Applicant
{
    private Integer application_num;
    private String applicant_name;
    private Date dob;

    public Applicant(int application_num, String applicant_name, Date dob)
    {
        this.application_num = application_num;
        this.applicant_name = applicant_name;
        this.dob = dob;
    }

    public Integer getApplication_num()
    {
        return application_num;
    }

    public void setApplication_num(int application_num) {
        this.application_num = application_num;
    }

    public String getApplicant_name() {
        return applicant_name;
    }

    public void setApplicant_name(String applicant_name) {
        this.applicant_name = applicant_name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Applicant{" +
                "application_num=" + application_num +
                ", applicant_name='" + applicant_name + '\'' +
                ", dob=" + dob +
                '}';
    }
}
