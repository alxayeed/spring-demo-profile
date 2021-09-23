package com.alxayeed.demo.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfileService {
    private final ProfileRepository profileRepository;

    @Autowired
    public ProfileService(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    public List<Profile> getProfiles() {
        return profileRepository.findAll();
    }

    public Profile addProfile(Profile profile){
        return profileRepository.save(profile);
    }

//    public Profile getProfile(Long id) {
//        return profileRepository.findProfile(id);
//    }

//    public void deleteProfile() {
//    }
//
//    public Profile updateProfile() {
//    }
//
//    public Profile addProfile() {
//    }
}
