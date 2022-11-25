package com.learn.demo.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.List;

@Entity(name = "employees")
public class Employee {
    public Employee() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employee_id;
    private String first_name;
    private String last_name;
    private String title;
    private String company;
    private String employee_bio;
    @Lob
    @Type(type = "org.hibernate.type.BinaryType")
    private byte[] employee_photo;
    @ManyToMany(mappedBy = "employees")
    @JsonBackReference
    private List<Skill> skills;

    public Long getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Long employee_id) {
        this.employee_id = employee_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getEmployee_bio() {
        return employee_bio;
    }

    public void setEmployee_bio(String employee_bio) {
        this.employee_bio = employee_bio;
    }

    public byte[] getEmployee_photo() {
        return employee_photo;
    }

    public void setEmployee_photo(byte[] employee_photo) {
        this.employee_photo = employee_photo;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
}
