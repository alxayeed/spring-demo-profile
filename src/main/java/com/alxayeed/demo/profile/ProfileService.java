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

    public Optional<Profile> getProfile(Long id) {
        return profileRepository.findById(id);
    }

    public void deleteProfile(Long id){
        Boolean isExistProfile = profileRepository.existsById(id);
        if (!isExistProfile){
            throw new IllegalStateException("Profile with ID "+ id + " Does not exist");
        }
        profileRepository.deleteById(id);
    }

//    public Profile updateProfile() {
//    }

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
