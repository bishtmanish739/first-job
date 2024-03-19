package com.jopapps.www.First.Job.app.Service;
import com.jopapps.www.First.Job.app.Entity.Profile;

import java.util.List;

public interface ProfileService {
    public Profile registerUser(Profile profile);

    Profile getUserById(Long id);

    void deleteUserById(Long id);

    Profile updateProfileById(Profile profile);
}
