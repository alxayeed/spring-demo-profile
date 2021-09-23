package com.alxayeed.demo.profile;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/profile")
public class ProfileController {

    @GetMapping
    public List<Profile> getProfiles(){
        //return list of students

    }

    @GetMapping
    public Profile getProfile(){
        // returns single user profile object
    }

    @PostMapping
    public Profile addProfile(){
        // adds a profile object
    }

    @PutMapping
    public Profile updateProfile (){
        // update profile object
    }

    @DeleteMapping
    public void deleteProfile(){
        // deletes a profile object
    }



}
