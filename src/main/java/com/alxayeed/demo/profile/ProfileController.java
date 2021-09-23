package com.alxayeed.demo.profile;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/profile")
public class ProfileController {

    private final ProfileService profileService;

    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @GetMapping
    public List<Profile> getProfiles(){
        //return list of students
        return profileService.getProfiles();
    }

    @GetMapping
    public Profile getProfile(){
        // returns single user profile object
        return profileService.getProfile();
    }

    @PostMapping
    public Profile addProfile(){
        // adds a profile object
        return profileService.addProfile();
    }

    @PutMapping
    public Profile updateProfile (){
        // update profile object
        return profileService.updateProfile();
    }

    @DeleteMapping
    public void deleteProfile(){
        // deletes a profile object
        profileService.deleteProfile();
    }



}
