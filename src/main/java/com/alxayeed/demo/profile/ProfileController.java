package com.alxayeed.demo.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="api/v1/profile")
public class ProfileController {

    private final ProfileService profileService;

    @Autowired
    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @GetMapping
    public List<Profile> getProfiles(){
        return profileService.getProfiles();
    }

    @GetMapping(path = "{profileId}")
    public Optional<Profile> getProfile(@PathVariable("profileId") Long id){
        return profileService.getProfile(id);
    }

    @PostMapping()
    public Profile addProfile(@RequestBody Profile profile){
        // adds a profile object
        return profileService.addProfile(profile);
    }

//    @PutMapping
//    public Profile updateProfile (){
//        // update profile object
//        return profileService.updateProfile();
//    }

    @DeleteMapping(path = "{profileId}")
    public void deleteProfile(@PathVariable("profileId") Long id){
        // deletes a profile object
        profileService.deleteProfile(id);
    }



}
