package com.alxayeed.demo.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
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

    public Optional<Profile> getProfile(Long id) {
        return profileRepository.findById(id);
    }

    public Profile addProfile(Profile profile){
        return profileRepository.save(profile);
    }

    public void deleteProfile(Long id){
        Boolean isExistProfile = profileRepository.existsById(id);
        if (!isExistProfile){
            throw new IllegalStateException("Profile with ID "+ id + " Does not exist");
        }
        profileRepository.deleteById(id);
    }

    @Transactional
    public Profile updateProfile(Long profileId, LocalDate dob, String email, String fullName, String nickName) {
        Profile profile = profileRepository.findById(profileId)
                .orElseThrow(()-> new IllegalStateException("Profile with ID "+ profileId + " Does not exist"));

        if (email != null &&
                email.length() > 0 && !Objects.equals(profile.getEmail(), email)){
            profile.setEmail(email);
        };

        if (dob != null && dob.toString().length() > 0 && !Objects.equals(profile.getDob(), dob)){
            profile.setDob(dob);
        };

        if (fullName != null && fullName.length() > 0 && !Objects.equals(profile.getFullName(), fullName)){
            profile.setFullName(fullName);
        };

        if (nickName != null && nickName.length() > 0 && !Objects.equals(profile.getNickName(), nickName)){
            profile.setNickName(nickName);
        };

        return profile;


    }
}
