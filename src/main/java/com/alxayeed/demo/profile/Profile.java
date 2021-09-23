package com.alxayeed.demo.profile;

import javax.persistence.*;
import java.time.LocalDate;

public class Profile {
    private Long id;
    private String fullName;
    private String nickName;
    private LocalDate dob;
    private Integer age;
    private String email;

    public Profile() {

    }

    public Profile(Long id,
                   String fullName,
                   String nickName,
                   LocalDate dob,
                   Integer age,
                   String email) {
        this.id = id;
        this.fullName = fullName;
        this.nickName = nickName;
        this.dob = dob;
        this.age = age;
        this.email = email;
    }

    public Profile(String fullName,
                   String nickName,
                   LocalDate dob,
                   Integer age,
                   String email) {
        this.fullName = fullName;
        this.nickName = nickName;
        this.dob = dob;
        this.age = age;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
