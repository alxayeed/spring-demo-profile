package com.alxayeed.demo.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
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

    @PutMapping(path = "{profileId}")
    public Profile updateProfile (   @PathVariable("profileId") Long profileId,
                                  @RequestParam(required = false) LocalDate dob,
                                  @RequestParam(required = false) String email,
                                  @RequestParam(required = false) String fullName,
                                  @RequestParam(required = false) String nickName
                                  ){
        // update profile object
        return profileService.updateProfile(profileId, dob, email, fullName, nickName);
    }

    @DeleteMapping(path = "{profileId}")
    public void deleteProfile(@PathVariable("profileId") Long id){
        // deletes a profile object
        profileService.deleteProfile(id);
    }



}
