package com.jopapps.www.First.Job.app.Controller;

import com.jopapps.www.First.Job.app.Entity.Profile;
import com.jopapps.www.First.Job.app.Service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProfileController {
    @Autowired
    ProfileService profileService;

    @GetMapping("/profile/{id}")
    ResponseEntity<Profile> getProfile(@PathVariable long id){
      return   ResponseEntity.ok(profileService.getUserById(id));

    }

    @PostMapping("/profile")
    ResponseEntity<Profile> getProfile(@RequestBody Profile profile){
        return   ResponseEntity.ok(profileService.registerUser(profile));

    }
    @DeleteMapping("/profile/{id}")
    ResponseEntity<Void> deleteProfile(@PathVariable long id){
        profileService.deleteUserById(id);
        return  ResponseEntity.ok(null);
    }


}
