package com.jopapps.www.First.Job.app.Service.ServiceImpl;

import com.jopapps.www.First.Job.app.Entity.Job;
import com.jopapps.www.First.Job.app.Entity.Profile;
import com.jopapps.www.First.Job.app.Repository.JobRepository;
import com.jopapps.www.First.Job.app.Repository.ProfileRepository;
import com.jopapps.www.First.Job.app.Service.JobService;
import com.jopapps.www.First.Job.app.Service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ProfileServiceImpl implements ProfileService {
    @Autowired
    ProfileRepository profileRepository;


    @Override
    public Profile registerUser(Profile profile) {
        return profileRepository.save(profile);
    }

    @Override
    public Profile getUserById(Long id) {
        return profileRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteUserById(Long id) {
    try{
        profileRepository.deleteById(id);
    }
    catch (Exception e){
        throw  e;
    }
    }

    @Override
    public Profile updateProfileById(Profile profile) {
        return profileRepository.save(profile);
    }
}
